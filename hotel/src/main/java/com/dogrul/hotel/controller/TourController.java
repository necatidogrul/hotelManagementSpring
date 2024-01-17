// TourController.java
package com.dogrul.hotel.controller;

import com.dogrul.hotel.entity.Customer;
import com.dogrul.hotel.entity.Tour;
import com.dogrul.hotel.service.CustomerService;
import com.dogrul.hotel.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TourController {

    @Autowired
    private TourService tourService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/tour")
    public List<Tour> get() {
        return tourService.get();
    }

    @PostMapping("/tour")
    public Tour save(@RequestBody Tour tourObj){
        tourService.save(tourObj);
        return tourObj;
    }

    @PutMapping("/{tourId}/addCustomer/{customerId}")
    public Tour addCustomerToTour(@PathVariable int tourId, @PathVariable int customerId) {
        // Tur ve müşteri var mı diye kontrol et
        Tour tour = tourService.get(tourId);
        if (tour == null) {
            throw new RuntimeException("Tour not found with id: " + tourId);
        }

        Customer customer = customerService.get(customerId);
        if (customer == null) {
            throw new RuntimeException("Customer not found with id: " + customerId);
        }

        // Turun participants listesine müşteriyi ekle
        tour.addCustomer(customer);

        // Turu güncelle
        tourService.save(tour);

        return tour;
    }

    @PutMapping("/api/tour/{tourId}/addCustomer/{customerId}")
    public ResponseEntity<String> addCustomerToTour(@PathVariable Long tourId, @PathVariable Long customerId) {
        try {
            tourService.addCustomer(tourId, customerId);
            return ResponseEntity.ok("Customer added to the tour successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Tour is full, cannot add more customers.");
        }
    }
}

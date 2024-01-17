// TourService.java
package com.dogrul.hotel.service;

import com.dogrul.hotel.entity.Tour;
import java.util.List;

public interface TourService {
    List<Tour> get();
    Tour get(int id);
    void save(Tour tour);
    void create(Tour tour);
    void delete(int id);

    void addCustomer(Long tourId, Long customerId);
}

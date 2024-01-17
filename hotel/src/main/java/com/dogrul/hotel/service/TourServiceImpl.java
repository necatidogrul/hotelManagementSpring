// TourServiceImpl.java
package com.dogrul.hotel.service;

import com.dogrul.hotel.dao.TourDAO;
import com.dogrul.hotel.entity.Tour;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourDAO tourDAO;

    @Transactional
    @Override
    public List<Tour> get() {
        return tourDAO.get();
    }

    @Transactional
    @Override
    public Tour get(int id) {
        return null;
    }

    @Override
    public void save(Tour tour) {
        tourDAO.save(tour);
    }

    @Transactional
    @Override
    public void create(Tour tour) {
    }

    @Transactional
    @Override
    public void delete(int id) {
    }

    @Override
    public void addCustomer(Long tourId, Long customerId) {

    }
}

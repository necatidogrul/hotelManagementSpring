// TourDAO.java
package com.dogrul.hotel.dao;

import com.dogrul.hotel.entity.Tour;

import java.util.List;

public interface TourDAO {
    List<Tour> get();
    Tour get(int id);
    void save(Tour tour);
    void create(Tour tour);
    void delete(int id);
}

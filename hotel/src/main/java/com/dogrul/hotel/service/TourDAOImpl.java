// TourDAOImpl.java
package com.dogrul.hotel.service;

import com.dogrul.hotel.dao.TourDAO;
import com.dogrul.hotel.entity.Tour;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TourDAOImpl implements TourDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Tour> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Tour> query = currentSession.createQuery("from Tour", Tour.class);
        List<Tour> list = query.getResultList();
        return list;
    }

    @Override
    public Tour get(int id) {
        return null; // Implement as needed
    }

    @Override
    public void save(Tour tour) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(tour);
    }

    @Override
    public void create(Tour tour) {
        // Implement as needed
    }

    @Override
    public void delete(int id) {
        // Implement as needed
    }
}

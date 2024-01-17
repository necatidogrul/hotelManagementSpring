// Tour.java
package com.dogrul.hotel.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="tour")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name ="tour_name")
    private String tourName;

    @Column(name ="participants")
    @OneToMany(mappedBy = "tour")
    private List<Customer> participants;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public List<Customer> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Customer> participants) {
        this.participants = participants;
    }

    public void addCustomer(Customer customer) {
        if (participants == null) {
            participants = new ArrayList<>();
        }
        participants.add(customer);
    }
}

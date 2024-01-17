package com.dogrul.hotel.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name ="firstname")
    private String firstName;

    @Column(name ="lastname")
    private String lastName;

    @Column(name ="tcno")
    private Integer tcNo;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getTcNo() {
        return tcNo;
    }

    public void setTcNo(Integer tcNo) {
        this.tcNo = tcNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}

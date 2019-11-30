package com.example.demo.model;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "FLIGHTS")
@Data
public class Flight {
    @Id
    private Long id;

    @Column(name="region")
    private String region;

    @Column(name="price")
    private Long price;

    @Column(name = "orderNumber")
    private Integer orderNumber;

    @Column(name = "destination")
    private String destination;

    @ManyToOne
    @JoinColumn(name = "TRAVEL_ID")
    private Travel travel;

}

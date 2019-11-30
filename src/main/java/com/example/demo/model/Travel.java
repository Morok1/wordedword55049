package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "TRAVELS")
@Data
public class Travel {
    @Id
    private long travel_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "travel")
    private List<Flight> flights;
}

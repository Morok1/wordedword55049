package com.example.demo.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "USERS")
@Getter
public class User {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Travel> travels;
}

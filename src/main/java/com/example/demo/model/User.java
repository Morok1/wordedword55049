package com.example.demo.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "USERS")
@Data
public class User {
    @Id
    long id;
    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Travel> travels = new HashSet<Travel>();
}

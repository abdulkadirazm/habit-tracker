package com.abka.habittrackerv2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
public class Acitivity {

    @Id
    @GeneratedValue
    private Integer id;

    @
    private Habit habit;

    @CreationTimestamp
    private Instant createOn;

    @UpdateTimestamp
    private Instant updatedOn;
}

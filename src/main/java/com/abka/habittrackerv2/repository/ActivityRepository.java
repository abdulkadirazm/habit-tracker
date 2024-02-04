package com.abka.habittrackerv2.repository;

import com.abka.habittrackerv2.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
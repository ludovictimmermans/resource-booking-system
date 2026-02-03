package com.example.resourcebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resourcebooking.domain.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    boolean existsByNameIgnoreCase(String name);
}

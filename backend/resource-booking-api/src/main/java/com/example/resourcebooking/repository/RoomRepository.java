package com.example.resourcebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resourcebooking.domain.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

    boolean existsByNameIgnoreCase(String name);
}

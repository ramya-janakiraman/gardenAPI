package com.example.review1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.review1.model.Garden;
public interface GardenRepo extends JpaRepository<Garden,Integer> {

}
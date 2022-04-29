package com.example.FirstApplication.repository;

import com.example.FirstApplication.entity.BootCampDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BootCampDAO extends JpaRepository<BootCampDetails,Integer> {


}

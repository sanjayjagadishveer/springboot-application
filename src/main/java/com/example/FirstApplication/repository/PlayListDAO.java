package com.example.FirstApplication.repository;

import com.example.FirstApplication.entity.PlayListDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayListDAO extends JpaRepository<PlayListDetails,Integer> {
}

package com.example.FirstApplication.repository;

import com.example.FirstApplication.Dto.PlayListResponse;
import com.example.FirstApplication.entity.PlayListDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayListDAO extends JpaRepository<PlayListDetails,Integer> {

    @Query(value = "select * from playlist where singer_name=?1",nativeQuery = true)
    PlayListDetails findByName(String singerName);

    @Query(value = "select * from playlist where singer_name=?1 and id=?2",nativeQuery = true)
    PlayListDetails findByNameAndId(String singerName,int id);
}

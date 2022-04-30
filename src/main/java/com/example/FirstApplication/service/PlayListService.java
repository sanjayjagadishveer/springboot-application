package com.example.FirstApplication.service;

import com.example.FirstApplication.Dto.PlayListResponse;
import com.example.FirstApplication.entity.PlayListDetails;
import org.springframework.stereotype.Component;

@Component
public interface PlayListService {

    PlayListResponse getPlayListDetails(int listId);

    PlayListResponse getSingerDetails(String singerName);

    PlayListResponse getSingerNameAndId(String singerName,int id);



}

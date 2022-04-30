package com.example.FirstApplication.service;

import com.example.FirstApplication.Dto.PlayListResponse;
import org.springframework.stereotype.Component;

@Component
public interface PlayListService {

    PlayListResponse getPlayListDetails(int listId);
}

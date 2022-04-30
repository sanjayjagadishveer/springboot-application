package com.example.FirstApplication.controller;

import com.example.FirstApplication.Dto.PlayListResponse;
import com.example.FirstApplication.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayListController {

    @Autowired
    private PlayListService playListService;

    @GetMapping("get-playlist/{listId}")
    public PlayListResponse getPlayListDetails(@PathVariable int listId)
    {
        return playListService.getPlayListDetails(listId);
    }

}

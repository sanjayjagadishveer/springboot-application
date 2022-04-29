package com.example.FirstApplication.controller;

import com.example.FirstApplication.Dto.BootCampDetailsResponse;
import com.example.FirstApplication.service.BootCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootCampController {

    @Autowired
    private BootCampService bootCampService;

    @GetMapping("get-details/{batchId}")
    public BootCampDetailsResponse getBootCampDetails(@PathVariable int batchId)
    {
    return bootCampService.getBootCampDetails(batchId);
    }
}

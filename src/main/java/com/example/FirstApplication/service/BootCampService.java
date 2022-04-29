package com.example.FirstApplication.service;

import com.example.FirstApplication.Dto.BootCampDetailsResponse;
import com.example.FirstApplication.entity.BootCampDetails;
import org.springframework.stereotype.Component;

@Component
public interface BootCampService {
BootCampDetailsResponse getBootCampDetails(int batchId);
}

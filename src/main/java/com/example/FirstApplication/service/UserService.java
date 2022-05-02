package com.example.FirstApplication.service;

import com.example.FirstApplication.Dto.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface UserService {



    ResponseEntity<BaseResponse> fetchUserDetails(int userId);
}

package com.example.FirstApplication.controller;


import com.example.FirstApplication.Dto.BaseResponse;
import com.example.FirstApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("fetch-user-details/{userId}")
    public ResponseEntity<BaseResponse> getUserDetails(@PathVariable int userId) {
        if (userId == 0 || String.valueOf(userId) == null) {
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("id cannot be neither  null or zero");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.BAD_REQUEST);
        }
        return service.fetchUserDetails(userId);
    }
}

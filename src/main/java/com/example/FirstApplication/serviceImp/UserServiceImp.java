package com.example.FirstApplication.serviceImp;

import com.example.FirstApplication.Dto.BaseResponse;
import com.example.FirstApplication.Dto.UserResponse;
import com.example.FirstApplication.entity.User;
import com.example.FirstApplication.repository.UserDAO;
import com.example.FirstApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public ResponseEntity<BaseResponse> fetchUserDetails(int userId) {

        Optional<User> user = userDAO.findById(userId);

        User userDetails = user.get();
        UserResponse userResponse = new UserResponse();
        BaseResponse baseResponse = new BaseResponse();

        if (!user.isPresent()) {
            baseResponse.setMessage("user not found");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());

        }

        userResponse.setCustomerName(userDetails.getCustomerName());
        userResponse.setContactNumber(userDetails.getAccountNumber());
        userResponse.setContactNumber(userDetails.getContactNumber());
        userResponse.setEmailId(userDetails.getEmailId());


        baseResponse.setMessage("Data fetched successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());

        baseResponse.setResponse(userResponse);


        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK);
    }
}

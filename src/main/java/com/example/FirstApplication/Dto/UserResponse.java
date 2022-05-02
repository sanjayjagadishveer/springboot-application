package com.example.FirstApplication.Dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserResponse {
    private int id;
    private String customerName;
    private int accountNumber;
    private int contactNumber;
    private String emailId;
}

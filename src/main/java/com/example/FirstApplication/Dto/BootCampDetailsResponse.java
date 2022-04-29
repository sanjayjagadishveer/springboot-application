package com.example.FirstApplication.Dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BootCampDetailsResponse {

    private String trainer;
    private String technology;
    private  int duration;
    private List<ReviewResponse> reviewResponse;


}

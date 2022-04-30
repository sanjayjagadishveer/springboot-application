package com.example.FirstApplication.Dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PlayListReview {
    private String name;
    private String description;
    private double rating;

}

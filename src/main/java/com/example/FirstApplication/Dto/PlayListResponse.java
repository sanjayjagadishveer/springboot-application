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
public class PlayListResponse {

    private String songName;
    private String singerName;
    private String songDuration;

    private List<PlayListReview> reviews;

}

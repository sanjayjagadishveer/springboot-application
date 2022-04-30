package com.example.FirstApplication.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "playlist")
public class PlayListDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "song_name")
    private  String songName;

    @Column(name = "singer_name")
    private  String singerName;

    @Column(name = "duration")
    private String duration;

}

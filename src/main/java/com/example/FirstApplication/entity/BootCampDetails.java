package com.example.FirstApplication.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "camp_details")
public class BootCampDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private  String trainerName;

    @Column(name = "technology")
    private  String technology;

    @Column(name = "duration")
    private int duration;

}

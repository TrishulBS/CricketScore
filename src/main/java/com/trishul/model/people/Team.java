package com.trishul.model.people;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
    private String name;
    private String tourName;
    private List<Player> players;
    private List<SupportStaff> supportStaffs;

    public Team(String name, String tourName){
        this.name = name;
        this.tourName = tourName;
        players = new ArrayList<>();
        supportStaffs = new ArrayList<>();
    }
}

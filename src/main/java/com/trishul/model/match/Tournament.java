package com.trishul.model.match;


import com.trishul.model.people.Person;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Getter
@Setter
public class Tournament {
    private String name;
    private List<Team> teams;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Team winner;
    private Team runner;
    private List<Match> matches;
    private List<String> sponsors;
    private Map<AwardType, Person> awards;

    public Tournament(String name, LocalDateTime start, LocalDateTime end){
        this.startDate = start;
        this.endDate = end;
        this.name = name;
        this.teams = new ArrayList<>();
        this.sponsors = new ArrayList<>();
        this.awards = new HashMap<>();
        this.matches = new ArrayList<>();


    }

}

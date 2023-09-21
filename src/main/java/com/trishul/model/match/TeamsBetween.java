package com.trishul.model.match;

import com.trishul.model.people.PlayingMembers;
import com.trishul.model.people.Team;

public class TeamsBetween {
    private Team team1;
    private Team team2;
    private PlayingMembers playingMembers1;
    private PlayingMembers getPlayingMembers2;

    public TeamsBetween(Team team1, Team team2){
        this.team1 = team1;
        this.team2 = team2;
    }
}

package com.trishul.repository;

import com.trishul.model.match.*;
import com.trishul.model.people.Commentator;
import com.trishul.model.people.Player;
import com.trishul.model.people.Scorer;
import com.trishul.model.people.Team;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSink {
    public static Map<String, Tournament> tournamentMap = new HashMap<>();
    public static Map<String, Match> matchMap = new HashMap<>();
    public static Map<String, Team> teamMap = new HashMap<>();
    public static Map<String, Player> playerMap = new HashMap<>();
    public static Map<String, Commentator> commentators = new HashMap<>();
    public static Map<String, Scorer> scorerMap = new HashMap<>();
    public static Map<String, Stadium> stadiumMap = new HashMap<>();
    public static Map<String, List<Fixture>> fixtureMap = new HashMap<>();
    public static Map<String, Map<Integer, ScoreCard>> scoreCardMap = new HashMap<>();
}

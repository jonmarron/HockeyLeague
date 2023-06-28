package com.jontxu.HockeyLeague.logic;

import com.jontxu.HockeyLeague.data.Coach;
import com.jontxu.HockeyLeague.data.League;
import com.jontxu.HockeyLeague.data.Team;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HockeyLeagueService {
    private final League league;

    public HockeyLeagueService(League league) {
        this.league = league;
    }

    public Map<Coach, List<Team>> teamsWithSameCoach(){
        return league.teams().stream()
                .collect(Collectors.groupingBy(Team::getCoach));
    }

    public Map<Team,Integer> getNumberOfWinsProTeam(){
        return league.teams().stream()
                .collect(Collectors.toMap(team -> team, Team::getWins));
    }
    public Team getTeamWithMostWins(){
        return getNumberOfWinsProTeam().entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

    }
}

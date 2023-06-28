package com.jontxu.HockeyLeague.data;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Game {
    private final Map<Team, Integer> scores;
    private final String location;

    public Game(Map<Team, Integer> scores, String location) {
        this.scores = scores;
        this.location = location;
    }

    public Team getWinner(){
        return scores.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(score -> score.getKey())
                .orElse(null);
    }
}

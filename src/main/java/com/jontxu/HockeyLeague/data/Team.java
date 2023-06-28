package com.jontxu.HockeyLeague.data;

import java.util.List;

public final class Team {
    private final String name;
    private final List<Game> games;
    private final List<Player> players;
    private final Player captain;
    private final Coach coach;
    private int wins;

    public Team(String name, List<Game> games, List<Player> players, Player captain, Coach coach) {
        this.name = name;
        this.games = games;
        this.players = players;
        this.captain = captain;
        this.coach = coach;
        this.wins = setWins();
    }

    public int setWins(){
        return (int) games.stream()
                .filter(game -> this.equals(game.getWinner()))
                .count();
    }

    public String getName() {
        return name;
    }

    public List<Game> getGames() {
        return games;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getCaptain() {
        return captain;
    }

    public Coach getCoach() {
        return coach;
    }

    public int getWins() {
        return wins;
    }
}

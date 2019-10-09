package ru.nsu.home;

public class SC2Player {
    private String nickName;
    private int points;
    private League league;
    private Race race;

    public SC2Player(String nickName, League league, Race race){
        this.nickName = nickName;
        this.points = 0;
        this.league = league;
        this.race = race;
    }

    public String getNickName() {
        return nickName;
    }

    public League getLeague() {
        return league;
    }

    public Race getRace() {
        return race;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
        if(this.points < 0){
            this.points = 0;
        }
    }
}
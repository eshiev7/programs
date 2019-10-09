package ru.nsu.home;

import java.util.ArrayList;
import java.util.List;

public class LeagueManagerImpl implements LeagueManager {

    private static List<SC2Player> sc2PlayerList = new ArrayList<SC2Player>();

//------------------------Add-------------------------------------------
    @Override
    public void addPlayer(SC2Player player) {
        int count = 0;
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            if(player.getNickName() == sc2PlayerList.get(i).getNickName()){
                count++;
                }
            }
        if(count == 0){
            sc2PlayerList.add(player);
        }

    }

//------------------------Remove----------------------------------------
    @Override
    public void removePlayer(SC2Player player) {
        sc2PlayerList.remove(player);
    }

//------------------------GetPlayer-------------------------------------
    @Override
    public SC2Player getPlayer(String name) {
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            if(sc2PlayerList.get(i).getNickName() == name){
                return sc2PlayerList.get(i);
            }
        }
        throw new NullPointerException("Нет такого игрока");
    }

//-------------------------GetAll---------------------------------------
    @Override
    public SC2Player[] getAllPlayers() {
        SC2Player[] kek0 = new SC2Player[sc2PlayerList.size()];
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            kek0[i] = sc2PlayerList.get(i);
        }
        if(kek0.length == 0){
            throw new NullPointerException("Лига героев пуста.");
        }
        return kek0;
    }

//------------------------GetLeague----------------------------------------
    @Override
    public SC2Player[] getPlayers(League league) {
        int count = 0;
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            if(sc2PlayerList.get(i).getLeague() == league){
                count++;
            }
        }
        SC2Player[] kek = new SC2Player[count];
        int count1 = 0;
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            if(sc2PlayerList.get(i).getLeague() == league){
                kek[count1] = sc2PlayerList.get(i);
                count1++;
            }
        }
        if(kek.length == 0){
            throw new NullPointerException("Никто не состоит в данной лиге.");
        }
        return kek;
    }

//---------------------------GetRace---------------------------------------
    @Override
    public SC2Player[] getPlayers(Race race) {
        int count = 0;
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            if(sc2PlayerList.get(i).getRace() == race){
                count++;
            }
        }
        SC2Player[] kek1 = new SC2Player[count];
        int count1 = 0;
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            if(sc2PlayerList.get(i).getRace() == race){
                kek1[count1] = sc2PlayerList.get(i);
                count1++;
            }
        }
        if(kek1.length == 0){
            throw new NullPointerException("Нет представителей данной расы");
        }
        return kek1;
    }

//-------------------------Points--------------------------------------------
    @Override
    public void addPoints(String name, int points) {
        int count = 0;
        for(int i = 0; i <= sc2PlayerList.size() - 1; i++){
            if(sc2PlayerList.get(i).getNickName() == name){
                count++;
                sc2PlayerList.get(i).setPoints(points);
            }
        }
        if(count == 0){
            throw new NullPointerException("Нет такого игрока");
        }
        LevenshteinDistance()

    }
}
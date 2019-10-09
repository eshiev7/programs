package ru.nsu.home;

public class Main {

    public static void main(String[] args) {
		LeagueManager leagueManager = new LeagueManagerImpl();

//-----------------------------------------CreatePlayers--------------------------------------------------
		SC2Player player1 = new SC2Player("Darth_Vader", League.PLATINUM, Race.TERRAN);
		SC2Player player2 = new SC2Player("Luke_Skywalker", League.DIAMOND, Race.ZERG);
		SC2Player player3 = new SC2Player("Darth_Sidius", League.PLATINUM, Race.ZERG);
		SC2Player player4 = new SC2Player("Obi_Wan", League.DIAMOND, Race.TERRAN);

//---------------------------------------AddPlayers-------------------------------------------------
		leagueManager.addPlayer(player1);
		leagueManager.addPlayer(player2);
		leagueManager.addPlayer(player3);
		leagueManager.addPlayer(player4);

//---------------------------------------AddPoints--------------------------------------------------
		leagueManager.addPoints("Darth_Vader", 45);
		leagueManager.addPoints("Darth_Vader", 46);
		leagueManager.addPoints("Luke_Skywalker", 89);
		leagueManager.addPoints("Luke_Skywalker", -150);
		leagueManager.addPoints("Obi_Wan", 77);
		leagueManager.addPoints("Darth_Sidius", 65);

//-----------------------------------Race----------------------------------------------------------------
		System.out.println("---------------------РАСА------------------------");
		for(int i = 0; i <= leagueManager.getPlayers(Race.ZERG).length - 1; i++){
			SC2Player kek = leagueManager.getPlayers(Race.ZERG)[i];
			System.out.println("Имя героя: " + kek.getNickName());
			System.out.println("Лига: " + kek.getLeague());
			System.out.println("Раса: " + kek.getRace());
			System.out.println("Количество очков: " + kek.getPoints());
			System.out.println("----------------------------");
		}
//-----------------------------------AllPlayers-----------------------------------------------------------
		System.out.println("--------------------Все игроки---------------------");
		for(int i = 0; i <= leagueManager.getAllPlayers().length - 1; i++){
			SC2Player kek1 = leagueManager.getAllPlayers()[i];
			System.out.println("Имя героя: " + kek1.getNickName());
			System.out.println("Лига: " + kek1.getLeague());
			System.out.println("Раса: " + kek1.getRace());
			System.out.println("Количество очков: " + kek1.getPoints());
			System.out.println("----------------------------");
		}
//--------------------------------------League------------------------------------------------------------
		System.out.println("-----------------------Лига-------------------------");
		for(int i = 0; i <= leagueManager.getPlayers(League.PLATINUM).length - 1; i++){
			SC2Player kek1 = leagueManager.getPlayers(League.PLATINUM)[i];
			System.out.println("Имя героя: " + kek1.getNickName());
			System.out.println("Лига: " + kek1.getLeague());
			System.out.println("Раса: " + kek1.getRace());
			System.out.println("Количество очков: " + kek1.getPoints());
			System.out.println("----------------------------");
		}
    }
}
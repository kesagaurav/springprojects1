package com.gaurav.dao;

import java.util.List;

import com.gaurav.model.Player;

public  interface PlayerDao {

	Player addPlayer(Player player);
	void updatePlayer(String name,int id);
	Player getPlayerById(int id);
	void deletePlayer(int id);
	List<Player> getAllPlayers();
	List<Player> getPlayersBySportsName(String sportsName);
	List<Player> getPlayersByCity(String city);
	List<Player> getPlayersByAge(int age);
	List<Player> getPlayersByGender(String gender);
}

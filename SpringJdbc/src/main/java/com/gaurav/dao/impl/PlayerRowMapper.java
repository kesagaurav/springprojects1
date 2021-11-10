package com.gaurav.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.RowMapper;

import com.gaurav.model.Player;

public class PlayerRowMapper implements RowMapper<Player> {

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player player=new Player();
		player.setPlayer_id(rs.getInt("player_id"));
		player.setName(rs.getString("name"));
		player.setAge(rs.getInt("age"));
		player.setGender(rs.getString("gender"));
		player.setCity(rs.getString("city"));
		player.setSportsName(rs.getString("sportsName"));
		player.setContact(rs.getString("contact"));
		player.setTeam_id(rs.getInt("team_id"));
		return player;
	}

	
}

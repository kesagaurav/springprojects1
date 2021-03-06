package com.gaurav.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.gaurav.dao.PlayerDao;
import com.gaurav.model.Player;
@Component("playerDao")
public class PlayerDaoImpl implements PlayerDao {

		private JdbcTemplate template;
		private DataSource dataSource;
		
		@Autowired
		public void setDataSource(DataSource dataSource) {
			this.dataSource=dataSource;
			this.template=new JdbcTemplate(dataSource);
		}
		
	
	@Override
	public Player addPlayer(Player player) {
		String sql="insert into player(player_id,name,age,gender,city,sportsName,contact,team_id) values(?,?,?,?,?,?,?,?)";
		template.update(sql,player.getPlayer_id(),player.getName(),player.getAge(),player.getGender(),player.getCity(),player.getSportsName(),player.getContact(),player.getTeam_id());
		return player;
	}

	@Override
	public void updatePlayer(String name,int id) {
		String sql="update player set name=? where player_id=?";
		template.update(sql,name,id);
		System.out.println("\n player updated successfully");
		
	}

	@Override
	public Player getPlayerById(int id) {
	String sql="select player_id,name,age,gender,city,sportsName,contact,team_id from player  where player_id=?";
	Player player=template.queryForObject(sql, new Object[] {id},new PlayerRowMapper());
		return player;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		String sql="delete from player where player_id=?";
		template.update(sql,id);
		System.out.println("\n player deleted succesfully " + id);
		
	}

	@Override
	public List<Player> getAllPlayers() {
		String sql="select player_id,name,age,gender,city,sportsName,contact,team_id from player";
		List<Player> playerList=template.query(sql, new PlayerRowMapper());
		return playerList;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) {
		String sql="select player_id,name,age,gender,city,sportsName,contact,team_id from player where sportsName=?";
		List<Player> playerList=template.query(sql,new PlayerRowMapper(),new Object[] {sportsName});
		return playerList;
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		String sql="select player_id,name,age,gender,city,sportsName,contact,team_id from player where city=?";
		List<Player> playerList=template.query(sql,new PlayerRowMapper(),new Object[] {city});
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		String sql="select player_id,name,age,gender,city,sportsName,contact,team_id from player where age=?";
		List<Player> playerList=template.query(sql,new PlayerRowMapper(),new Object[] {age});
		return playerList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) {
		String sql="select player_id,name,age,gender,city,sportsName,contact,team_id from player where gender=?";
		List<Player> playerList=template.query(sql,new PlayerRowMapper(),new Object[] {gender});
		return playerList;
	}

}

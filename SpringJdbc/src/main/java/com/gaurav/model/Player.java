package com.gaurav.model;

public class Player {

	private int player_id;
	private String name;
	private int age;
	private String gender;
	private String city;
	private String sportsName;
	private String contact;
	private int team_id;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int player_id, String name, int age, String gender, String city, String sportsName, String contact,
			int team_id) {
		super();
		this.player_id = player_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.sportsName = sportsName;
		this.contact = contact;
		this.team_id = team_id;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city="
				+ city + ", sportsName=" + sportsName + ", contact=" + contact + ", team_id=" + team_id + "]";
	}
	
	
	
	
}

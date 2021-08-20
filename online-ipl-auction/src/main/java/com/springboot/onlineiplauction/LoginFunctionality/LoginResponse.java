package com.springboot.onlineiplauction.LoginFunctionality;

public class LoginResponse {
	private int id;
	private String Firstname;
	private String Lastname;
	private boolean isAdmin;
	private boolean isPlayer;
	private boolean isTeamOwner;

	public LoginResponse() {

	}
	public LoginResponse(int id, String FirstName, String LastName, boolean isAdmin, boolean isPlayer, boolean isTeamOwner) {
		this.setId(id);
		this.setFirstname(FirstName);
		this.setLastname(LastName);
		this.setAdmin(isAdmin);
		this.setPlayer(isPlayer);
		this.setTeamOwner(isTeamOwner);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean isPlayer() {
		return isPlayer;
	}
	public void setPlayer(boolean isPlayer) {
		this.isPlayer = isPlayer;
	}
	public boolean isTeamOwner() {
		return isTeamOwner;
	}
	public void setTeamOwner(boolean isTeamOwner) {
		this.isTeamOwner = isTeamOwner;
	}

}


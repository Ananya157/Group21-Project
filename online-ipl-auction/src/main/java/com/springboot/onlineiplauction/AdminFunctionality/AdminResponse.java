package com.springboot.onlineiplauction.AdminFunctionality;

public class AdminResponse {
	private int id;
	private String Firstname;
	private String Lastname;
	private int Age;
	private String Country;
	private String Record;
	private String PreviousTeam;
	private int LastBidValue;
	private double BattingAverage;
	private double BowlingAverage;
	private String CurrentTeam;
	private boolean isNominated;
	private boolean Status;
	private boolean isFreezed;
	
	public AdminResponse() {

	}
	public AdminResponse(int id, String FirstName, String LastName, int Age, String Country, String Record, String PreviousTeam,
			int LastBidValue, double BattingAverage, double BowlingAverage, String CurrentTeam, boolean isNominated, boolean Status, boolean isFreezed) {
		this.setId(id);
		this.setFirstname(FirstName);
		this.setLastname(LastName);
		this.setAge(Age);
		this.setCountry(Country);
		this.setRecord(Record);
		this.setPreviousTeam(PreviousTeam);
		this.setLastBidValue(LastBidValue);
		this.setBattingAverage(BattingAverage);
		this.setBowlingAverage(BowlingAverage);
		this.setCurrentTeam(CurrentTeam);
		this.setNominated(isNominated);
		this.setStatus(Status);
		this.setFreezed(isFreezed);
		
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
	
	public double getBowlingAverage() {
		return BowlingAverage;
	}
	public void setBowlingAverage(double bowlingAverage) {
		BowlingAverage = bowlingAverage;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPreviousTeam() {
		return PreviousTeam;
	}
	public void setPreviousTeam(String previousTeam) {
		PreviousTeam = previousTeam;
	}
	public String getRecord() {
		return Record;
	}
	public void setRecord(String record) {
		Record = record;
	}
	public int getLastBidValue() {
		return LastBidValue;
	}
	public void setLastBidValue(int lastBidValue) {
		LastBidValue = lastBidValue;
	}
	public double getBattingAverage() {
		return BattingAverage;
	}
	public void setBattingAverage(double battingAverage) {
		BattingAverage = battingAverage;
	}
	public String getCurrentTeam() {
		return CurrentTeam;
	}
	public void setCurrentTeam(String currentTeam) {
		CurrentTeam = currentTeam;
	}
	public boolean isNominated() {
		return isNominated;
	}
	public void setNominated(boolean isNominated) {
		this.isNominated = isNominated;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public boolean isFreezed() {
		return isFreezed;
	}
	public void setFreezed(boolean isFreezed) {
		this.isFreezed = isFreezed;
	}

}
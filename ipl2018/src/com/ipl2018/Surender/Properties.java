package com.ipl2018.Surender;

public class Properties extends TeamMain {
	private String Name;
	private String Jersy_Color;
	private String City;
	private String Home_Ground;
	private String isLastYearChampion;

	Properties(String Name, String Jersy_Color, String City, String Home_Ground, String isLastYearChampion) {
		this.Name = Name;
		this.Jersy_Color = Jersy_Color;
		this.City = City;
		this.Home_Ground = Home_Ground;
		this.isLastYearChampion = isLastYearChampion;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getJersy_Color() {
		return Jersy_Color;
	}

	public void setJersy_Color(String jersy_Color) {
		Jersy_Color = jersy_Color;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getHome_Ground() {
		return Home_Ground;
	}

	public void setHome_Ground(String home_Ground) {
		Home_Ground = home_Ground;
	}

	public String getIsLastYearChampion() {
		return isLastYearChampion;
	}

	public void setIsLastYearChampion(String isLastYearChampion) {
		this.isLastYearChampion = isLastYearChampion;
	}

	void print() {
		System.out.println("Ipl Team Name ##" + Name + "\n Color:" + Jersy_Color + "\n City" + City + "\n Home_Ground"
				+ Home_Ground + "\n isLastYearChampion" + isLastYearChampion);
	}

}

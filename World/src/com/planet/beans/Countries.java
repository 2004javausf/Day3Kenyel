package com.planet.beans;

public class Countries {
	private String name;
	private String capital;
	private int population;
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public String getCapital () {
		return capital;
	}
	
	public void setCapital (String capital) {
		this.capital=capital;
	}
		
	public int getPopulation() {
		return population;
				
	}
	public void setPopulation(int population) {
		this.population=population;
	}
	
	public String toString() {
		return "Countries [name="+name +", capital="+capital + ", population=" + population +"]";
	}
}

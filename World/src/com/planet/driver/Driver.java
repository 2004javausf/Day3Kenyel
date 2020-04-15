package com.planet.driver;

import com.planet.beans.Countries;
import com.planet.beans.States;

public class Driver {

	public static void main(String[] args) {
		Countries c = new Countries();
		c.setName("The Moon");
		c.setCapital("Some random crater");
		c.setPopulation(0);
		
		States s = new States();
		s.setName("Moonopolis");
		s.setNickname("The city on the bright side");
		s.setSize(2);
		
		System.out.println("I want a summerhome in " + s.getNickname());

	}

}

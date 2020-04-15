package com.planet.beans;

public class States {
	private String name;
	private String nickname;
	private int size;
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public String getNickname () {
		return nickname;
	}
	
	public void setNickname (String nickname) {
		this.nickname=nickname;
	}
		
	public int getSize() {
		return size;
				
	}
	public void setSize(int size) {
		this.size=size;
	}
	
	public String toString() {
		return "Countries [name="+name +", nickname="+nickname + ", size=" + size +"]";
	}
}

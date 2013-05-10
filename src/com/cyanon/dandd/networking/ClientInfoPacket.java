package com.cyanon.dandd.networking;

import java.io.Serializable;

import com.cyanon.dandd.monsters.Monster;

//Version 1.0 of this packet

public class ClientInfoPacket extends Packet implements Serializable {
	
	private static final long serialVersionUID = -4669308677000327413L;
	
	private String clientName;
	private Monster monster;
	
	public ClientInfoPacket(String name, Monster monster) //used to start game and sync client with server
	{
		setClientName(name);
		setMonster(monster);
	}
	
	public ClientInfoPacket(String name) //not used yet
	{
		setClientName(name);
	}

	public ClientInfoPacket(Monster monster) //used to update client
	{
		setMonster(monster);
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

}

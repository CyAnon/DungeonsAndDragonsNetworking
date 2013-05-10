package com.cyanon.dandd.networking;

import com.cyanon.dandd.attacktype.Attack;

public class ServerToClientPacket extends Packet {

	private Attack payloadMonster;
	private String payloadString;
	
	private Boolean monsterPacketCheck = false;
	private Boolean stringPacketCheck = false;
	
	public ServerToClientPacket(Attack attack)
	{
		this.payloadMonster = attack;
		this.monsterPacketCheck = true;
	}
	
	public ServerToClientPacket(String string)
	{
		this.payloadString = string;
		this.stringPacketCheck = true;
	}
	
	public Attack getAttack()
	{
		if (this.payloadMonster != null)
			return payloadMonster;
		else
			return null; //handle this better!
	}
	
	public String getString()
	{
		if (this.payloadString != null)
			return payloadString;
		else
			return null; //handle this better!
	}
	
	public Boolean getIsMonsterPacket()
	{
		return monsterPacketCheck;
	}
	
	public Boolean getIsStringPacket()
	{
		return stringPacketCheck;
	}

}

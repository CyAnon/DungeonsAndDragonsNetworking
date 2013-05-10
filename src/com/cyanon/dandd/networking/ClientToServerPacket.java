package com.cyanon.dandd.networking;

import com.cyanon.dandd.attacktype.Attack;
import com.cyanon.dandd.monsters.Monster;

public class ClientToServerPacket extends Packet {

	private Attack payloadAttack;
	private String payloadString;
	
	private Boolean attackPacketCheck = false;
	private Boolean stringPacketCheck = false;
	
	
	public ClientToServerPacket(Attack attack)
	{
		this.payloadAttack = attack;
		this.attackPacketCheck = true;
	}
	
	public ClientToServerPacket(String string)
	{
		this.payloadString = string;
		this.stringPacketCheck = true;
	}
	
	public Attack getAttack()
	{
		if (this.payloadAttack != null)
			return payloadAttack;
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
	
	public Boolean getIsAttackPacket()
	{
		return attackPacketCheck;
	}
	
	public Boolean getIsStringPacket()
	{
		return stringPacketCheck;
	}

}

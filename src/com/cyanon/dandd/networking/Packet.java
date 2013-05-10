package com.cyanon.dandd.networking;

import java.io.Serializable;

import com.cyanon.dandd.attacktype.Attack;
import com.cyanon.dandd.monsters.Monster;

public abstract class Packet implements Serializable {

	private static final long serialVersionUID = -1738426765256602083L;
	public boolean processedByServer = false;

	public Packet()
	{
		
	}
	
	public Attack getAttack()
	{
		return null;
	}
	
	public String getString()
	{
		return null;
	}
	
	public Boolean getIsAttackPacket() //overridden
	{
		return false;
	}
	
	public Boolean getIsStringPacket() //overridden
	{
		return false;
	}

	public String getClientName() 
	{
		return null;
	}
	
	public Monster getMonster()
	{
		return null;
	}

}

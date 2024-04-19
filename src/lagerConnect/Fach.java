package lagerConnect;

import java.util.ArrayList;

public class Fach {
	private ArrayList <Ware> warenInFach = new ArrayList<>();
	private byte freiPlatz = 8;
	
	public Ware getWarenat(byte i)
	{
		return warenInFach.get(i);
	}
	
	public void addWare(Ware saving)
	{
		warenInFach.add(saving);
		freiPlatz -= saving.groesse;
	}
	
	public void removeWare(Ware a)
	{
		warenInFach.remove(a);
		freiPlatz += a.groesse;
	}
	
	public byte getFreiPlatz()
	{
		return freiPlatz;
	}
	
	
	public String warenList()
	{
		String output="";
		for(Ware w: warenInFach)
		{
			output += w.name +"| ";
		}
		return output;
	}
	
	
}

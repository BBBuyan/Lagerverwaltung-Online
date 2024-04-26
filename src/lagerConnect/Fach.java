package lagerConnect;

import java.util.ArrayList;

public class Fach {
	private ArrayList <Ware> fachInhalt = new ArrayList<>();
	private byte freiPlatz = 8;
	
	public Ware getWarenat(byte i)
	{
		return fachInhalt.get(i);
	}
	
	public void addWare(Ware saving)
	{
		fachInhalt.add(saving);
		freiPlatz -= saving.groesse;
	}
	
	public void removeWare(Ware a)
	{
		fachInhalt.remove(a);
		freiPlatz += a.groesse;
	}
	
	public byte getFreiPlatz()
	{
		return freiPlatz;
	}
	
	
	public String warenList()
	{
		String output="";
		for(int i = 0; i<fachInhalt.size(); i++)
		{
			output += fachInhalt.get(i).name +" | ";
		}
		if(output != "")
		{
			return output;
		}
		else
		{
			return null;
		}
	}
	
	public boolean findRemove(String n, String sr)
	{
		for(Ware e: fachInhalt)
		{
			if(e.name.equals(n))
			{
				removeWare(e);
				return true;
			}
		}
		return false;
	}
	
	
}

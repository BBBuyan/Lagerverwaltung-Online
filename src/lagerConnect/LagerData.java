package lagerConnect;

public class LagerData {
	public Regal [] regals = new Regal[8];
	
	public LagerData()
	{
		for(int i = 0; i<8;i++)
		{
			regals [i]= new Regal();
		}
	}
	
	public void einlagern(String n, String sr, int gr)
	{
		Ware storing = new Ware(n,sr,gr);
		bestFit(gr).addWare(storing);
	}
	
	public Fach bestFit(int gr)
	{
		for (Regal r: regals)
		{
			for(byte i = 0; i<r.regalInhalt.length;i++)
			{
				for(byte j = 0; j<r.regalInhalt[i].length;j++)
				{
					if(gr <= r.regalInhalt[i][j].getFreiPlatz())
					{
						return r.regalInhalt[i][j];
					}
				}
			}
		}
		return null;
	}
	
	public int bestFitStore(String n, String sr, int gr)
	{
		Ware storing = new Ware (n,sr,gr);
		int i;
		for(i = 0; i<8 ; i++)
		{
			for(int x = 0; x<10; x++)
			{
				for(int y=0; y<10; y++)
				{
					if(gr<=regals[i].regalInhalt[x][y].getFreiPlatz())
					{
						regals[i].regalInhalt[x][y].addWare(storing);
						return i;
					}
				}
			}
		}
		return i;
	}
}

package lagerConnect;

public class Regal {
	public Fach[][] regalInhalt = new Fach[2][3];
	
	public Regal()
	{
		for(int i = 0; i<regalInhalt.length;i++)
		{
			for(int j = 0; j<regalInhalt[i].length; j++)
			{
				regalInhalt[i][j] = new Fach();
			}
		}
	}
	
	public Fach getFachat(int i, int j)
	{
		return regalInhalt[i][j];
	}
}

package lagerConnect;

public class Regal {
	public Fach[][] regalInhalt = new Fach[10][10];
	
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
	
	public String getAllWare()
	{
		String allname = "";
		String tmp = null;
		for(int i = 0; i<regalInhalt.length;i++)
		{
			for(int j = 0; j<regalInhalt[i].length;j++)
			{
				tmp = regalInhalt[i][j].warenList();
				if (tmp != null)
				{
					allname += tmp;
				}
			}
		}
		return allname;
	}
}

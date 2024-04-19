package lagerConnect;

public class Lager {
	
	private LagerData data;
	private LagerGUI view;
	
	public Lager()
	{
		data = new LagerData();
		view = new LagerGUI(data);
	}
	
	public static void main(String [] args)
	{
		Lager app = new Lager();
		app.view.setVisible(true);
		Regal a = app.data.regals[1];
		Ware test = new Ware("test", "testsr",2);
		Ware test2 = new Ware("test2","test2sr",4);
		a.getFachat(1, 1).addWare(test);
		a.getFachat(1, 1).addWare(test2);
		System.out.println(a.getFachat(1, 1).warenList()+a.getFachat(1, 1).getFreiPlatz());
	}

}
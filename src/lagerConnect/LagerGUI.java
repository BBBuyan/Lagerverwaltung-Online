package lagerConnect;

import java.awt.Color;

import javax.swing.JFrame;

public class LagerGUI extends JFrame{
	private LagerData data;
	
	public LagerGUI(LagerData d)
	{
		this.data=d;
		this.setLayout(null);
		this.setSize(1280,720);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setTitle("Lager Verwaltung Online");
		this.setLocationRelativeTo(null);
	}
}

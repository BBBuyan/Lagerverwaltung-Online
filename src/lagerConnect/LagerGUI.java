package lagerConnect;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LagerGUI extends JFrame{
	private LagerData data;
	private JPanel regalPanel, inhaltPanel, controlPanel, contentPanel;
	
	public LagerGUI(LagerData d)
	{
		this.data=d;
		this.setSize(1280,720);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setTitle("Lager Verwaltung Online");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPanel = new JPanel();
		contentPanel.setLayout(null);
		contentPanel.setPreferredSize(new Dimension(1280, 720));
		this.setContentPane(contentPanel);
		this.pack();
		
		inhaltPanel = new JPanel();
		inhaltPanel.setBounds(400,0,880,720);
		inhaltPanel.setBackground(Color.yellow);
		contentPanel.add(inhaltPanel);
		
		regalPanel = new JPanel();
		regalPanel.setBounds(0,0,400,230);
		regalPanel.setBackground(Color.DARK_GRAY);
		regalPanel.setLayout(null);
		contentPanel.add(regalPanel);
		
		controlPanel = new JPanel();
		controlPanel.setBounds(0,230,400,490);
		controlPanel.setBackground(Color.green.darker().darker());
		controlPanel.setLayout(null);
		contentPanel.add(controlPanel);
		
		JButton regal1 = new JButton("Regal: 1");
		regal1.setBounds(30, 30, 150, 20);
		regalPanel.add(regal1);
		
		JButton regal2 = new JButton("Regal: 2");
		regal2.setBounds(30, 70, 150, 20);
		regalPanel.add(regal2);
		
		JButton regal3 = new JButton("Regal: 3");
		regal3.setBounds(30, 110, 150, 20);
		regalPanel.add(regal3);
		
		JButton regal4 = new JButton("Regal: 4");
		regal4.setBounds(30, 150, 150, 20);
		regalPanel.add(regal4);
		
		JButton regal5 = new JButton("Regal: 5");
		regal5.setBounds(220, 30, 150, 20);
		regalPanel.add(regal5);
		
		JButton regal6 = new JButton("Regal: 6");
		regal6.setBounds(220, 70, 150, 20);
		regalPanel.add(regal6);
		
		JButton regal7 = new JButton("Regal: 7");
		regal7.setBounds(220, 110, 150, 20);
		regalPanel.add(regal7);
		
		JButton regal8 = new JButton("Regal: 8");
		regal8.setBounds(220, 150, 150, 20);
		regalPanel.add(regal8);
		
		JButton exit = new JButton("Exit");
		exit.setBounds(245,195,100,20);
		regalPanel.add(exit);
	
	}
}

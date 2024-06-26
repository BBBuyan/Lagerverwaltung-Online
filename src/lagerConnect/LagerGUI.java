package lagerConnect;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LagerGUI extends JFrame{
	private LagerData data;
	private JPanel regalPanel, inhaltPanel, controlPanel, contentPanel, wahlPanel;
	private JTextArea namenArea, serienNrArea, groesseArea, messageArea, inhaltArea;
	private JLabel inhaltLabel,messageLabel,serienNrLabel,namenLabel,groesseLabel;
	private JComboBox<String> comboBox, hochWertBox;
	
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
		
		//Alles Inhalt
		inhaltPanel = new JPanel();
		inhaltPanel.setBounds(400,0,880,720);
		inhaltPanel.setBackground(Color.LIGHT_GRAY);
		inhaltPanel.setLayout(null);
		contentPanel.add(inhaltPanel);
		
		inhaltLabel = new JLabel("Hier Inhalt");
		inhaltLabel.setBounds(400,10,200,20);
		inhaltPanel.add(inhaltLabel);
		
		inhaltArea = new JTextArea();
		inhaltArea.setBounds(40,40,800,500);
		inhaltPanel.add(inhaltArea);
		
		//Alles Regal Panel
		regalPanel = new JPanel();
		regalPanel.setBounds(0,0,400,230);
		regalPanel.setBackground(Color.DARK_GRAY);
		regalPanel.setLayout(null);
		contentPanel.add(regalPanel);
		
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
		
		JButton exitbutton = new JButton("Exit");
		exitbutton.setBounds(245,195,100,20);
		regalPanel.add(exitbutton);
		exitbutton.addActionListener(e->exit());
		regal1.addActionListener(e-> show(0));
		regal2.addActionListener(e-> show(1));
		regal3.addActionListener(e-> show(2));
		regal4.addActionListener(e-> show(3));
		regal5.addActionListener(e-> show(4));
		regal6.addActionListener(e-> show(5));
		regal7.addActionListener(e-> show(6));
		regal8.addActionListener(e-> show(7));
		
		//Alles Wahl Panel
		wahlPanel = new JPanel();
		wahlPanel.setBounds(0,230,400,40);
		wahlPanel.setLayout(null);
		wahlPanel.setBackground(Color.orange);
		contentPanel.add(wahlPanel);
		
		comboBox = new JComboBox<>(new String[]{"Einlagern", "Auslagern"});
		comboBox.setBounds(80, 10, 100, 20);
		wahlPanel.add(comboBox);
		
		hochWertBox = new JComboBox<>(new String [] {"Normal", "Hochwertig"});
		hochWertBox.setBounds(220, 10, 100, 20);
		wahlPanel.add(hochWertBox);
		
		
		//Alles Control Panel
		controlPanel = new JPanel();
		controlPanel.setBounds(0,270,400,450);
		controlPanel.setBackground(Color.green.darker().darker());
		controlPanel.setLayout(null);
		contentPanel.add(controlPanel);
		
		namenArea = new JTextArea("");
		namenArea.setBounds(100, 10, 270, 20);
		controlPanel.add(namenArea);
		
		namenLabel = new JLabel("Name:");
		namenLabel.setBounds(30, 10, 50, 20);
		namenLabel.setForeground(Color.white);
		controlPanel.add(namenLabel);
		
		serienNrArea = new JTextArea("");
		serienNrArea.setBounds(100, 50, 270, 20);
		controlPanel.add(serienNrArea);
		
		serienNrLabel = new JLabel("SerienNr:");
		serienNrLabel.setBounds(30,50,70,20);
		serienNrLabel.setForeground(Color.WHITE);
		controlPanel.add(serienNrLabel);
		
		groesseArea = new JTextArea("");
		groesseArea.setBounds(100, 90, 70, 20);
		controlPanel.add(groesseArea);
		
		groesseLabel = new JLabel("Groesse:");
		groesseLabel.setBounds(30, 90, 70, 20);
		groesseLabel.setForeground(Color.white);
		controlPanel.add(groesseLabel);
		
		messageArea = new JTextArea("");
		messageArea.setBounds(100, 150, 270, 20);
		controlPanel.add(messageArea);
		
		messageLabel = new JLabel("Message:");
		messageLabel.setBounds(30, 150, 100, 20);
		messageLabel.setForeground(Color.white);
		controlPanel.add(messageLabel);

		JButton einlagernButton = new JButton("Einlagern");
		einlagernButton.setBounds(100,250, 100, 20);
		controlPanel.add(einlagernButton);
		einlagernButton.addActionListener(e->einlagernGUI());
		
		JButton auslagernButton = new JButton("Auslagern");
		auslagernButton.setBounds(270,250,100,20);
		controlPanel.add(auslagernButton);
		auslagernButton.addActionListener(e->auslagernGUI());
	}
	
	
	public void einlagernGUI()
	{
		int groesse = Integer.parseInt(groesseArea.getText());
		String name = namenArea.getText();
		String sernr = serienNrArea.getText();
		
		int storedRegal = data.bestFitStore(name, sernr, groesse);
		if(storedRegal <8)
		{
			show(storedRegal);
		}
		
	}
	
	public void auslagernGUI()
	{
		String name = namenArea.getText();
		String sernr = serienNrArea.getText();
		
		int index = data.auslagern(name, sernr);
		
		if(index < 8)
		{
			show(index);
		}
	}
	
	public void show(int num)
	{
		Regal temp = data.regals[num];
		inhaltArea.setText(temp.getAllWare());
	}
	
	
	
	public void exit()
	{
		System.exit(0);
	}
	
}

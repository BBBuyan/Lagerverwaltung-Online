package lagerConnect;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

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
		Regal a = app.data.regals[1];
		Ware test = new Ware("test", "testsr",2);
		Ware test2 = new Ware("test2","test2sr",4);
		a.getFachat(1, 1).addWare(test);
		a.getFachat(1, 1).addWare(test2);
		System.out.println(a.getFachat(1, 1).warenList()+a.getFachat(1, 1).getFreiPlatz());
		
		
		//SQL Connection Bereich
		Connection conn = null;
		try {
			
			String url = "jdbc:oracle:thin:@141.57.9.192:1521:imora19c";
			String username = "C##GDB23013";
			String pass = "oracle";
			
			
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	
			conn = DriverManager.getConnection(url,username,pass);
			
			if(conn != null)
			{
				System.out.println("Connected!!!");
				Statement smt = conn.createStatement();
				String sql = "SELECT name FROM testing";
				ResultSet rset = smt.executeQuery(sql);
				String val;
				while(rset.next())
				{
					val = rset.getString("name");
					System.out.println(val);
				}
				
			}
			else
			{
				System.out.println("Failed to Connect!!!");
			}
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			
			try {
				if(conn !=null)
				{
					conn.close();
					System.out.println("conn closed");
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
	}
}
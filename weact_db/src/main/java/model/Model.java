package model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {
	
	private static String HOSTNAME = "ec2-176-34-253-124.eu-west-1.compute.amazonaws.com";
	private static int PORT = 3306;
	private static String SCHEMA_NAME = "ein2vd";
	private static String USERNAME = "ein2vd";
	private static String PASSWORD = "oleein2vd";
	Connection conn;
	
	public Model(){
		connect();
	}
	
	private void connect(){
		try {
			conn = DriverManager.getConnection("jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + SCHEMA_NAME, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.err.println("Verbinding me de databse kan niet worden opgezet");
			e.printStackTrace();
		}
	}
	
	public boolean isConnected(){
		try {
			return conn.isValid(5);
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void registerUser(String password, String email, String firstname, String lastname, String adress){
		if(isConnected()){
			java.sql.Statement statement = null;
			String query = String.format("INSERT INTO `users` (`password`, `email`, `firstname`, `lastname`, `adress`, `admin`, `status`, `emailvisible`) VALUES ('%s','%s','%s','%s','%s',0,1,1)",password,email,firstname,lastname,adress);
			
			try {
				statement= conn.createStatement();
				statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
			System.out.println(query);
		}
		
	}

}

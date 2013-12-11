package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.Model;

public class TestConnection {
	
	private static String HOSTNAME = "ec2-176-34-253-124.eu-west-1.compute.amazonaws.com";
	private static int PORT = 3306;
	private static String SCHEMA_NAME = "ein2vd";
	private static String USERNAME = "ein2vd";
	private static String PASSWORD = "oleein2vd";

	public static void main(String[] args)
	{
//		Connection conn = null;
//		try
//		{
//			conn = DriverManager.getConnection("jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + SCHEMA_NAME, USERNAME, PASSWORD);
//			System.out.println("Success!!!");
//		} 
//		catch (SQLException e)
//		{
//			System.out.println("Kon niet verbinden met de database. Melding: " + e.getMessage());
//		}
		Model model = new Model();
		model.registerUser("password", "email3", "firstname", "lastname", "address");
	}
}
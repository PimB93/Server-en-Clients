import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	
	private static String HOSTNAME = "ec2-176-34-253-124.eu-west-1.compute.amazonaws.com";
	private static int PORT = 3306;
	private static String SCHEMA_NAME = "ein2vc";
	private static String USERNAME = "ein2vc";
	private static String PASSWORD = "oleein2vc";
	
	

	public static void main(String[] args)
	{
		Connection conn = null;
		try 
		{
			conn = DriverManager.getConnection("jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + SCHEMA_NAME, USERNAME, PASSWORD);
			System.out.println("Success!!!");
		} 
		catch (SQLException e) 
		{
			System.out.println("Kon niet verbinden met de database. Melding: " + e.getMessage());
		}
		finally
		{
			try 
			{
				conn.close();
				System.out.println("Connectie gesloten");
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("connection object created failed is null.. :O ");
			}
		}
	}
	
}
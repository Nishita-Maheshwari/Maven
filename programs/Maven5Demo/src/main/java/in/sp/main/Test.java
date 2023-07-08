package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.login();
	}
	
	public void login()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven_mydb", "root", "root");
			
			PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
			ps.setString(1, "aaa@gmail.com");
			ps.setString(2, "aa123");
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("fail");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

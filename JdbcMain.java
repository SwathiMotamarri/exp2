package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JdbcMain 
{
	public static void main(String[] args) 
	{
		JdbcMain ex=new JdbcMain();
		ex.execute();
	}
	public void execute()
	{
		try
		{
			//Register driver
		DriverManager.registerDriver(new OracleDriver());;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		//String url="jdbc:oracle:thi:@localhost:1521:xe";
		//recreating connection
		Connection connection= DriverManager.getConnection(url,"scott","tiger");
		//create statement object
		Statement statement=connection.createStatement();
		//execute query to fetch result
		ResultSet resultSet=statement.executeQuery("Select * from Employees");
		while(resultSet.next())
			{
			int id=resultSet.getInt("id");
			String name=resultSet.getString("Name");
			System.out.println("id=" +id + "name=" +name);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Exception catched");
		}
	}
	
}


import java.sql.*;

public class operations
{
Connection conn;
CallableStatement cStmt;
int total_qty;
int total_cost;



operations ()
{
	total_qty=0;
	total_cost=0;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");			
	

	}	
	 catch(Exception e){
	    //Handle errors for Class.forName
	    e.printStackTrace();
	 }
}

void place_order(int id,int qty)
{
	try
	{
		conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
		cStmt=conn.prepareCall("{call place_order (?,?)}");
		cStmt.setInt(1, id);
		cStmt.setInt(2, qty);
		cStmt.executeQuery();
		
	
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}


}
void delete_account(String id)
{
	PreparedStatement ps,ps1,ps2;
	try
	{
	
	//System.out.println(login_id + "               ");
	conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
	
	
	ps1 = conn.prepareStatement("DELETE from Login  where id = ? ");
	ps1.setString(1, id);
	ps1.execute();
	
	ps2 = conn.prepareStatement("DELETE from Payment where id = ? ");
	ps2.setString(1, id);
	ps2.execute();
	ps = conn.prepareStatement("DELETE from Customer where id = ? ");
	ps.setString(1, id);
	ps.execute();
	
	
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
}
}

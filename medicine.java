

import java.sql.*;

public class medicine 
{
public int med_id;
int med_stock;
int med_price;
String med_name;
String med_type;
Connection conn;
PreparedStatement ps;
Statement stmt;
medicine ()
{
	med_id=0;
	med_stock=0;
	med_price=0;
	med_type="";
	med_type="";
	try
	{
	Class.forName("com.mysql.jdbc.Driver");			
	

	}	
	 catch(Exception e){
	    //Handle errors for Class.forName
	    e.printStackTrace();
	 }
}



boolean check_id(int med_id)
{
	boolean val=false;
	try
	{
	
	//System.out.println(login_id + "               ");
	conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
	ps = conn.prepareStatement("SELECT * from Medicine where med_id = ? ");
	ps.setInt(1, med_id);
	ResultSet resultSet = null;
	resultSet=ps.executeQuery();
	resultSet.next();
	if(resultSet!=null)
	{
		this.med_price=resultSet.getInt("med_price");
		this.med_name=resultSet.getString("med_name");
		this.med_stock=resultSet.getInt("med_stock");
		this.med_type=resultSet.getString("med_type");
		this.med_id=resultSet.getInt("med_id");
		val=true;
		return val;
	}
	
	
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	return val;
}

void insert_order(String cust_id,int qty,int cost)
{
	try
	{
	int order_id1=0;
    conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
    stmt=conn.createStatement();
	ResultSet rs=null;
	rs=stmt.executeQuery("SELECT * from orderr ");
	while(rs.next())
	{
      
		
	
		 order_id1 =rs.getInt("order_id");
   
     }
	order_id1++;
	ps=conn.prepareStatement("INSERT into orderr values(?,?,?,?,CURRENT_TIME(),CURDATE())");
	ps.setInt(1, order_id1);
	ps.setString(2, cust_id);
	ps.setInt(3, qty);
    ps.setInt(4,cost);
    
    ps.executeUpdate();
	
    
	conn.close();
	

	
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
}
	
}

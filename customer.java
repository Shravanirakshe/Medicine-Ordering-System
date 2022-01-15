
import java.sql.*;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class customer 
{
	Connection conn;
	PreparedStatement ps;
	CallableStatement cStmt;
	Statement stmt,stmt1;
	 String id;
	 String name ;
	 String address;
	 long zip;
	 long mobile;
	 String card_no;
	 String pswd;
	 int cvv;

customer()
{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");			
	

	}	
	 catch(Exception e){
	    //Handle errors for Class.forName
	    e.printStackTrace();
	 }
}

customer(String name1,String id1,String address1,long zip1,long mobile1,String card_no1,int cvv1,
		String pswd1)
{
	this.id=id1;
	this.name=name1;
	this.address=address1;
	this.zip=zip1;
	this.mobile=mobile1;
	this.card_no=card_no1;
	this.cvv=cvv1;
	this.pswd=pswd1;
	
}

boolean sign_in ()
{
	try
	{
		
	
    conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
	ps=conn.prepareStatement("INSERT  into Customer(id,name,address,zip,mobile_no) values(?,?,?,?,?)");
	ps.setString(1, id);
	ps.setString(2, name);
	ps.setString(3, address);
    ps.setLong(4,zip);
    ps.setLong(5, mobile);
    ps.executeUpdate();
	
    
    ps=conn.prepareStatement("INSERT  into Login(id,username,password) values(?,?,?)");
    ps.setString(1,id);
    ps.setString(2,name);
    ps.setString(3, pswd);
    ps.executeUpdate();
    
    ps=conn.prepareStatement("INSERT into Payment values(?,?,?)");
    ps.setString(1,id);
    ps.setString(2, card_no);
    ps.setInt(3, cvv);
    ps.executeUpdate();
	conn.close();
	

	return true;
	}
	catch(MySQLIntegrityConstraintViolationException o)
	{
		System.out.println(o);
		return false;
	}catch(SQLException e)
	{
		e.printStackTrace();
		return false;
	} 
}

boolean log_in()
{ 

	boolean val=false;
	try
	{
	conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
    stmt=conn.createStatement();
	ResultSet rs=null;ResultSet rs1=null;
	rs=stmt.executeQuery("SELECT * from Login  ");
	while(rs.next())
	{
      
		
		String name1 = rs.getString("username");
		String id1 =rs.getString("id");
		//String password1=rs.getString("password");
		if(name.equalsIgnoreCase(name1)&&id.equals(id1))
		{
			ps = conn.prepareStatement("SELECT Login.password from Login inner join Customer on  Customer.id=Login.id where Customer.id=?");
			ps.setString(1, id1);
			rs1=ps.executeQuery();
			rs1.next();
			if(rs1.getString("password").equals(pswd))
			{
			val=true;
			}
		}
		
   
     }
	
}catch(SQLException e)
{
	e.printStackTrace();
}
	return val;	
	
}


customer view_profile(String login_id)
{
	customer ret=new customer();
	try
	{
	
	System.out.println(login_id + "               ");
	conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
	ps = conn.prepareStatement("SELECT * from Customer where id = ? ");
	ps.setString(1, login_id);
	ResultSet resultSet = null;
	resultSet=ps.executeQuery();
	resultSet.next();
	ret.name=resultSet.getString("name");
	ret.address=resultSet.getString("address");
	ret.zip=resultSet.getInt("zip");
	ret.id=resultSet.getString("id");
	ret.mobile=resultSet.getLong("mobile_no");
	
	ps = conn.prepareStatement("SELECT * from Payment where id = ? ");
	ps.setString(1, login_id);
	ResultSet rs = null;
	rs=ps.executeQuery();
	rs.next();
    ret.card_no=rs.getString("card_no");
    ret.cvv=rs.getInt("cvv");
	
	
	
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return ret;
	
}

void edit_profile(String login_id,String name,String address,Long zip,Long mobile,String cardno,int cvv)
{
	customer ret=new customer();
	PreparedStatement ps2,ps3;
	try
	{
	
	System.out.println(login_id + "               ");
	conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
	ps = conn.prepareStatement("UPDATE Customer set name=?,address=?,zip=?,mobile_no=?  where id = ? ");
	ps.setString(1,name);
	ps.setString(2, address);
	ps.setLong(3, zip);
	ps.setLong(4,mobile);
	ps.setString(5, login_id);
	ps.executeUpdate();
	ps2 = conn.prepareStatement("UPDATE Login set username=? where id = ? ");
	ps2.setString(1,name);
	ps2.setString(2, login_id);
	ps2.executeUpdate();
	ps3 = conn.prepareStatement("UPDATE Payment set card_no=?,cvv=? where id = ? ");
	ps3.setString(1,cardno);
	ps3.setInt(2,cvv);
	ps3.setString(3, login_id);
	ps3.executeUpdate();


	
	
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	
}


}

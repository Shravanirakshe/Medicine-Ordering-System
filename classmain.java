
import java.sql.*;
import java.lang.NumberFormatException;
import javax.swing.ImageIcon;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class classmain  extends  JFrame implements ActionListener
{

    static ArrayList<medicine> m1=new ArrayList<medicine>();
	JButton sign_in,log_in,save,login_next,view,edit,order,history,logout,delete_acc,signup_back;
	  JFrame f,f1 ,f2,f3;
	 JPanel main,panel1,panel2,panel3,panelv,panel_e,panel_o,panel_h;
      JLabel usernamel,idl,addressl,zipl,mobilel,passwordl,card_nol,cvvl,topic;
      JLabel login_namel,idl1,passwordl1,hello,hello1,med_id,med_qty;
      JTextField username,id,address,zip,mobile,card_no,cvv;
      JTextField login_name,id1,med_id1,med_qty1,pay_cvv;
      JPasswordField password,password1;
      String login_id;int total,qty;
      JButton backv,save_e,backo,add,pay,back_pay,confirm,backe,back1;
      JTable table;JLabel id_login;
      String[] columnNames = {"MedID", "MedName", "MedStock","MedType", "MedPrice"};
      String[]columnNames1={"MedName","MedQty","MedType","MedPrice","Totalcost"};
      String[] columnNames2={"OrderID","Quantity","Cost","Order time","Order date"};
      JLabel l1,cardl,img,img1;
      JTextArea total1,card1;
      JTextField edit_name,edit_address,edit_zip,edit_mobile,edit_card,edit_cvv;
      
      
   
	
	public void myFrame()
	   {
		
			   f=new JFrame();
			   f1=new JFrame();
			   id_login=new JLabel();
			   main = new JPanel();panel3=new JPanel();
			   panel1=new JPanel();panel2=new JPanel();panelv=new JPanel();
			   panel_e=new JPanel();panel_o=new JPanel();
			   panel_h=new JPanel();
			   username =new JTextField();address=new JTextField();mobile=new JTextField();
			   password =new JPasswordField();password1=new JPasswordField();
			   usernamel =new JLabel();idl=new JLabel();addressl=new JLabel();
			   mobilel=new JLabel();passwordl=new JLabel();idl1=new JLabel();
			   passwordl1=new JLabel();hello=new JLabel();
			   view=new JButton();edit=new JButton();order=new JButton();
			   history=new JButton();cardl=new JLabel();
			   logout=new JButton();
			   hello1=new JLabel();med_id1=new JTextField();
			   backv=new JButton();save_e=new JButton();
			   table=new JTable();delete_acc=new JButton();signup_back=new JButton();
			   backo=new JButton(); med_id=new JLabel();
			   med_qty1=new JTextField();med_qty =new JLabel();
			   add=new JButton();pay=new JButton();
			   back_pay=new JButton();total1=new JTextArea();card1=new JTextArea();
			   confirm=new JButton();backe=new JButton();
			   qty=0;back1=new JButton();
			   
			   img=new JLabel();img1=new JLabel();
			  img.setIcon(new ImageIcon("/home/shravani/medication-clipart-7.png"));
			    img.setBounds(600,0,100,100);
				f.add(img);
				img1.setIcon(new ImageIcon("/home/shravani/img3.jpg"));
				img1.setBounds(350,200,350,230);
				main.add(img1);
			   
			 
			   
			   id=new JTextField();id1=new JTextField();
			   zipl=new JLabel();zip=new JTextField();login_namel=new JLabel();
			   login_name=new JTextField();pay_cvv=new JTextField();
			   
			   
			    main.setBounds(0, 0, 700, 500);main.setLayout(null);main.setBackground(getBackground().white);
				panel1.setBounds(0,0,700,500);panel1.setLayout(null);panel1.setBackground(Color.WHITE);
				panel2.setBounds(0,0,700,500);panel2.setLayout(null);panel2.setBackground(Color.WHITE);
				panel3.setBounds(0,0,700,500);panel3.setLayout(null);panel3.setBackground(Color.WHITE);
				panelv.setBounds(0,0,700,500);panelv.setLayout(null);panelv.setBackground(Color.WHITE);
				panel_e.setBounds(0,0,700,500);panel_e.setLayout(null);panel_e.setBackground(Color.WHITE);
				panel_o.setBounds(0,0,700,500);panel_o.setLayout(null);
				panel_h.setBounds(0,0,700,500);panel_h.setLayout(null);
				
						
				
				sign_in = new JButton("Sign up");
				sign_in.setBounds(100, 250, 150, 30);
				sign_in.addActionListener(this);
			    
			    signup_back= new JButton("BACK");
			    signup_back.setBounds(20, 450, 70, 40);
			    signup_back.addActionListener(this);
				
				
				
			    topic=new JLabel();
			    topic.setBounds(50, 50, 550, 30);
			    topic.setForeground(Color.darkGray);
			    Font font = new Font(null, Font.BOLD, 25);
			    topic.setFont(font);
			    topic.setText("Medalife,order medicines instantly!");
			    
			   
			    
			    log_in = new JButton ("Log in "); log_in.setBounds(100, 300, 150, 30);
			    log_in.addActionListener(this);
			    main.add(topic);
			    main.add(log_in);
				main.add(sign_in);
				
				username.setBounds(150, 30, 150, 30);
				usernamel.setBounds(30,30,100,20);
				usernamel.setText("Enter name");
				
				id.setBounds(150 ,60,150,30);idl.setBounds(30,60,150,30);
				idl.setText("Enter ID");
				
				address.setBounds(150, 90, 150, 30);
				addressl.setBounds(30,90,150,30);addressl.setText("Enter address");
				
				zip.setBounds(150,120,150,30);
				zipl.setBounds(30,120,150,30);
				zipl.setText("Enter Zip");
				
				mobile.setBounds(150,150,150,30);
				mobilel.setBounds(30,150,150,30);
				mobilel.setText("Enter mobile");
				
				
				
				card_no=new JTextField(); card_nol=new JLabel();
				card_no.setBounds(150, 180, 150, 30);card_nol.setBounds(30,180,150,30);
				card_nol.setText("Enter card no.");
				
				cvv=new JTextField(); cvvl=new JLabel();
				cvv.setBounds(150,210,150,30);cvvl.setBounds(30,210,150,30);
				cvvl.setText("Enter cvv");
												
				password.setBounds(150, 240, 150, 30);
				passwordl.setBounds(30,240,150,30); passwordl.setText("Enter password");
				
				login_namel.setBounds(250, 50, 200, 30);login_name.setBounds(250,90,200,30);
				login_namel.setText("Login Name");
				login_namel.setForeground(Color.BLUE);
				idl1.setText("Login ID");
				idl1.setForeground(Color.BLUE);idl1.setBounds(250,130,200,30);
				id1.setBounds(250, 170, 200, 30);
				passwordl1.setBounds(250,210,200,30);passwordl1.setText("Enter login password");
				passwordl1.setForeground(Color.BLUE);
				password1.setBounds(250,250,200,30);
				
				login_next = new JButton();
				login_next.setBounds(350, 340, 100, 30);
				login_next.setText("Next");
				login_next.addActionListener(this);
				
				
				
				
				save =new JButton("Save");
				save.setBounds(200,400,70,40);
				save.addActionListener(this);
				panel1.add(username);
				panel1.add(usernamel);
				panel1.add(addressl);panel1.add(address);
				panel1.add(save);panel1.add(id);panel1.add(idl);
				panel1.add(zip);panel1.add(zipl);
				panel1.add(mobilel);
				panel1.add(mobile);
				panel1.add(password);panel1.add(passwordl);
				panel1.add(card_no);panel1.add(card_nol);panel1.add(cvv);
				panel1.add(cvvl);
				panel1.add(signup_back);
				
				back1.setText("BACK");
				back1.setBounds(20, 450, 70, 40);
				back1.addActionListener(this);
				
				
				panel2.add(login_namel);
				panel2.add(login_name);
				panel2.add(idl1);
				panel2.add(id1);
				panel2.add(password1);
				panel2.add(passwordl1);
				panel2.add(login_next);
				panel2.add(back1);
				
				hello.setBounds(200,120,200,50); 
				view.setBounds(200, 200, 200, 30); view.setText("View your profile");
				edit.setBounds(200, 250, 200, 30);  edit.setText("Edit your profile");
				order.setBounds(200, 300, 200, 30);  order.setText("Place an order");
				history.setBounds(200, 350, 200, 30);  history.setText("Check History");
				delete_acc.setBounds(200,400,200,30); delete_acc.setText("Delete account");
				view.addActionListener(this);edit.addActionListener(this);
				order.addActionListener(this);history.addActionListener(this);
				delete_acc.addActionListener(this);
				
				logout.setBounds(10, 10, 120, 30);
				logout.setText("Log out");
				logout.addActionListener(this);
				
				
				panel3.add(hello);
				panel3.add(view);
				panel3.add(edit);
				panel3.add(order);
				panel3.add(history);
				panel3.add(logout);
				panel3.add(delete_acc);
				panel3.add(id_login);
				
				hello1.setBounds(200, 50, 200, 50);
				backv=new JButton("BACK");
				backv.setBounds(50,400,70,40);
				backv.addActionListener(this);
				backo.setText("BACK");
				backo.setBounds(20, 450, 70, 40);
				backo.addActionListener(this);
				
				
				
				panelv.add(hello1);
				panelv.add(backv);
				
				save_e.setBounds(250,400,200,40);backe.setBounds(50,400,100,40);
				save_e.setText("Save changes!");backe.setText("BACK");
				
				save_e.addActionListener(this);backe.addActionListener(this);
				panel_e.add(save_e);
				panel_e.add(backe);
				
				back_pay.setText("BACK");
				back_pay.setBounds(50,500,70,40);back_pay.addActionListener(this);
				med_id.setBounds(20,410,200,20);
				med_id.setText("Enter ID of medicine");
				med_id1.setBounds (210,410,100,20);
				med_qty.setBounds(320 ,410,150,20);
				med_qty.setText("Enter quantity");
				med_qty1.setBounds(480,410,100,20);
				add.setBounds(650, 400, 70, 40);add.addActionListener(this);
				pay.setBounds(650, 450, 70, 40);pay.addActionListener(this);
				f1.add(med_id);  f1.add(add);
				f1.add(med_qty1); f1.add(pay);
				f1.add(med_qty);
				f1.add(med_id1);
				add.setText("ADD");pay.setText("PAY");
				total1.setBounds(200,200,100,40);card1.setBounds(200,250,200,40);
				cardl.setBounds(200,300,100,40);
				cardl.setText("Enter CVV");pay_cvv.setBounds(300, 300, 70, 40);
		        confirm.setText("Confirm Order");confirm.setBounds(200,350,200,40);confirm.addActionListener(this);
				
				
				
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panelv.setVisible(false);
				panel_e.setVisible(false);
				main.setVisible(true);
				f.add(main);
				f.add(panel1);
				f.add(panel2);
				f.add(panel3);
				f.add(panelv);
				f.add(panel_e);
				f.add(panel_h);
				f.setSize(700,500);
				f.setVisible(true);
			
	   
	   }
	
	
	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
classmain cm=new classmain();

try { 
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}
cm.myFrame();
cm.main.setBackground(Color.green);




	}

	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource()==sign_in)
		{
			
			main.setVisible(false);
			panel1.setVisible(true);
		
			 id.setText("");address.setText("");zip.setText("");mobile.setText("");
			 card_no.setText("");cvv.setText("");password.setText("");username.setText("");
		}
		else if(e.getSource()==save)
		{   
			
			int flag=0,flag1=0,flag2 =0,cvv1=0;
			customer c=new customer();boolean constraint;
			 String name1= username.getText();
			 long zip1=0,mobile1=0;  String id1 = id.getText();
			 String address1=address.getText();//zip1=Long.parseLong(zip.getText());
			// mobile1=Long.parseLong(mobile.getText());
			 String password1= new String(password.getPassword());
				String card_no1 = card_no.getText();
				//cvv1=Integer.parseInt(cvv.getText());
				
			 if(name1.trim().length()==0)
			 {
				 JOptionPane.showMessageDialog(null, "Name must not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
				
			 }
	      	else if(id1.trim().length()==0)
	        {
	        	JOptionPane.showMessageDialog(null, "ID must not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
	        	
	        }
			else if(address1.trim().length()==0)
			{
				JOptionPane.showMessageDialog(null, "Address must not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
			
			}
			else if(zip.getText()=="" || zip.getText().trim().length()!=6)
			{
			JOptionPane.showMessageDialog(null, "Enter valid zip", "Error", JOptionPane.ERROR_MESSAGE);
			//zip1=Long.parseLong(zip.getText());
			}
			else if(mobile.getText()==""||mobile.getText().trim().length()!=10)
			{
			 
			 JOptionPane.showMessageDialog(null, "Enter valid mobile number", "Error", JOptionPane.ERROR_MESSAGE);
				
			}
			else if (cvv.getText()==""||cvv.getText().trim().length()!=3)
			{
				JOptionPane.showMessageDialog(null, "Enter valid cvv", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if (card_no.getText()==""||card_no.getText().trim().length()!=12)
			{
				 JOptionPane.showMessageDialog(null, "Enter valid card number", "Error", JOptionPane.ERROR_MESSAGE);
					
			}
			else if(password1.length()<6)
			{
				JOptionPane.showMessageDialog(null, "Password too weak!", "Error", JOptionPane.ERROR_MESSAGE);
				password.setText("");
			}
			
			
	        else{
	        	try
	        	{
	        	zip1=Long.parseLong(zip.getText());
	        	
	        	}
	        	catch(NumberFormatException e1)
	        	{
	        		System.out.println(e1);
	        		flag=1;
	        	}
	        	try
	        	{
	        	mobile1=Long.parseLong(mobile.getText());
	        	}
	        	catch(NumberFormatException e2)
	        	{
	        		System.out.println(e2);
	        		flag1=1;
	        	}
	        	try
	        	{
	        		cvv1=Integer.parseInt(cvv.getText());
	        		
	        	}
	        	catch(NumberFormatException e2)
	        	{
	        		System.out.println( e2);flag2=1;
	        	}
	        	
	        	if (flag==1)
	        	{
	        		JOptionPane.showMessageDialog(null, "Enter valid zip", "Error", JOptionPane.ERROR_MESSAGE);
	        	}
	        	else if(flag1==1)
	        	{
	        		JOptionPane.showMessageDialog(null, "Enter valid mobile number", "Error", JOptionPane.ERROR_MESSAGE);
	        	}
	        	else if (flag2==1)
	        	{
	        		JOptionPane.showMessageDialog(null, "Enter valid cvv", "Error", JOptionPane.ERROR_MESSAGE);
	        	}
	        	else{
			c=new customer(name1,id1,address1,zip1,mobile1,card_no1,cvv1,password1);
			constraint=c.sign_in();
			if(constraint==true)
			{
			JOptionPane.showMessageDialog(null, "You have successfully signed up");
			}
			else
			{ 
				JOptionPane.showMessageDialog(null, "Use a different ID", "Error", JOptionPane.ERROR_MESSAGE);
			}
			panel1.setVisible(false);
			main.setVisible(true);
	        	}
			
			}
			
			
			
		}
		else if (e.getSource()==signup_back)
		{
			panel1.setVisible(false);
			main.setVisible(true);
		}
		else if(e.getSource()==log_in)
		{
			main.setVisible(false);
			panel2.setVisible(true);
		}
		else if (e.getSource()==back1)
		{
			panel2.setVisible(false);login_name.setText("");id1.setText("");password1.setText("");
			main.setVisible(true);
		}
		else if(e.getSource()==login_next)
		{
			boolean value=false;
			customer c=new customer();
			c.name=login_name.getText();
			c.id = id1.getText();	
			c.pswd= new String(password1.getPassword()); 
			value=c.log_in();
			if(value==true)
			{
				 
				 	        
				
				login_id=c.id; 	 
				JOptionPane.showMessageDialog(null, "You have successfully logged in");
				JTextField field = new JTextField();
				// id_login =new JLabel();
				id_login.setBounds(200, 150, 200, 50);
				id_login.setText("Identification : "+c.id);
			
	 	        
	 	        panel2.setVisible(false);
				panel3.add(field);
				//panel3.add(id);
				panel3.setVisible(true);
				//hello.setText("Hello ,"+ c.name + " !");
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Login Fail", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		else if(e.getSource()==view)
		{
			panel3.setVisible(false);
			customer c1=new customer();
			customer c2=new customer();
			c2=c1.view_profile(login_id);
			JLabel id_view =new JLabel(); JLabel zip_view=new JLabel();
			JLabel address_view =new JLabel();
			JLabel mobile_view = new JLabel();
			JLabel card_view=new JLabel();
			
			id_view.setText("Identification : "+c2.id);
			id_view.setBounds(200, 80, 200, 50);
			address_view.setText("Address :"+c2.address);
			address_view.setBounds(200,110,200,50);
			zip_view.setText("Zip :"+(Long.toString(c2.zip)));
			zip_view.setBounds(200, 140, 200, 50);
			mobile_view.setText("Mobile :"+(Long.toString(c2.mobile)));
			mobile_view.setBounds(200, 170, 200, 50);
			card_view.setText("Card Number :"+ c2.card_no);
			card_view.setBounds(200,200,200,50);
			
			panelv.add(id_view);
			panelv.add(address_view);
			panelv.add(zip_view);
			panelv.add(mobile_view);
			panelv.add(card_view);
			panelv.setVisible(true);
		   // hello.setText("Hello ,"+ c2.name + " !");
			
			
			
		}
		else if (e.getSource()==backv)
		{
			panelv.setVisible(false);
			panel3.setVisible(true);
		}
		else if (e.getSource()==edit)
		{
			
			panel3.setVisible(false);
			
			customer c1=new customer();
			customer c2=new customer();
			c2=c1.view_profile(login_id);
			 edit_name=new JTextField(); edit_zip = new JTextField();
			edit_address= new JTextField();edit_mobile=new JTextField();
			edit_card= new JTextField();edit_cvv= new JTextField();
			//,edit_address,edit_zip,edit_mobile=new JTextField();
			
			edit_name.setBounds(300,50,150,30);edit_address.setBounds(300,100,150,30);
			edit_zip.setBounds(300,150,150,30);edit_mobile.setBounds(300,200,150,30);
			edit_card.setBounds(300,250,150,30);edit_cvv.setBounds(300,300,150,30);
			edit_name.setText(c2.name);edit_address.setText(c2.address);
			edit_zip.setText(Long.toString(c2.zip));edit_mobile.setText(Long.toString(c2.mobile));
			edit_card.setText(c2.card_no);edit_cvv.setText(Integer.toString(c2.cvv));
			panel_e.add(edit_name);panel_e.add(edit_address);panel_e.add(edit_zip);
			panel_e.add(edit_mobile);panel_e.add(edit_card);panel_e.add(edit_cvv);
			panel_e.setVisible(true);
		}
		else if (e.getSource()==save_e)
		{
			
			customer e1 = new customer();
			String name=edit_name.getText();
			String address = edit_address.getText();
			Long zip=Long.parseLong(edit_zip.getText());
			Long mobile=Long.parseLong(edit_mobile.getText());
			String card=edit_card.getText();
			int cvv=Integer.parseInt(edit_cvv.getText());
			e1.edit_profile(login_id, name,address,zip,mobile,card,cvv);
			//hello1.setText("Hello ,"+ name + " !");
			System.out.println(name + " " + address + " " + zip+ " "+ mobile + " "+ card+ " "+ cvv);
			
			
			
		}
		else if (e.getSource()==backe)
		{
			panel_e.setVisible(false);
			panel3.setVisible(true);
			
		}
		else if(e.getSource()==order)
		{
			
			panel3.setVisible(false);
			panel_o.setVisible(true);
			//operations o= new operations();
			showTableData();
			m1.clear(); total=0;
			//o.place_order();
		}
		else if(e.getSource()==logout)
		{	
			panel3.setVisible(false);
			main.setVisible(true);
			login_name.setText("");
			id1.setText("");
			password1.setText("");
			
		}else if (e.getSource()==backo)
		{
			f1.setVisible(false);
			panel3.setVisible(true);
			f.setVisible(true);
		}
		else if ( e.getSource()==add)
		{
			boolean chk;int M_ID=0,flag=0, M_Qty=0,flag1=0;
			medicine m=new medicine();
			try
			{
			  M_ID=Integer.parseInt(med_id1.getText());
			}catch(NumberFormatException n)
			{
				System.out.println(n);flag=1;
				JOptionPane.showMessageDialog(null, "Enter valid ID", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			 try
			 {M_Qty=Integer.parseInt(med_qty1.getText());}
			 catch(NumberFormatException n1)
			 {
				 System.out.println(n1);flag1=1;
				 JOptionPane.showMessageDialog(null, "Enter valid amount", "Error", JOptionPane.ERROR_MESSAGE);
			 }
			 if(flag==0&&flag1==0)
			 {
				 chk=m.check_id(M_ID);
		    if(chk==true)
		    {
		    	m.med_stock=M_Qty;
		    	m1.add(m);
		    	med_id1.setText("");
		    	med_qty1.setText("");
		    	qty=qty+M_Qty;
		    }else
		    {
		    	JOptionPane.showMessageDialog(null, "Invalid ID", "Error", JOptionPane.ERROR_MESSAGE);
		    }
			 }
		   
		
			
		}
		else if (e.getSource()==pay)
		{
			pay_table();
			pay_cvv.setText("");
			
			
		}
		else if (e.getSource()==back_pay)
		{   f2.setVisible(false);
			f1.setVisible(true);
		}
		else if (e.getSource()==confirm)
		{   
			customer c1=new customer();operations o1=new operations();
			customer c2=new customer();
			c2=c1.view_profile(login_id);
		    int check =Integer.parseInt(pay_cvv.getText());
		    if(check==c2.cvv)
		    {
		    	JOptionPane.showMessageDialog(null, "Payment successful!Your order will be delivered under 30 mins");
		    	medicine m=new medicine();
				m.insert_order(login_id, qty, total);
				
				for(medicine obj :m1)
				   {
					   o1.place_order( obj.med_id,obj.med_stock);
				   }	
				
				
		    	f2.setVisible(false);
		    	f.setVisible(true);
		    	panel3.setVisible(true);
		    }else
		    {
		    	JOptionPane.showMessageDialog(null, "Payment Fail", "Error", JOptionPane.ERROR_MESSAGE);
		    	pay_cvv.setText("");
		    	
		    }
			
		}else if (e.getSource()==history)
		{
			history();
		}
		else if(e.getSource()==delete_acc)
		{
			if(JOptionPane.showConfirmDialog(f,"Are you sure you want to delete ?",
					"",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
			{
			operations o=new operations();
			o.delete_account(login_id);
			panel3.setVisible(false);
			main.setVisible(true);
			id_login.setText("");
			}
		}
			
		
	}
	public void showTableData()
	{
    f.setVisible(false);
     f1.add(backo);
	f1.setLayout(null);
	f1.setBounds(100, 100, 800, 500);
	med_id1.setText("");
	
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columnNames);
	table = new JTable();
	table.setModel(model); 
	
	table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	table.setFillsViewportHeight(true);
	JScrollPane scroll = new JScrollPane(table);
	scroll.setBounds(0, 70, 800, 300);
	f1.getContentPane().add(scroll);
	
	scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
	scroll.setViewportView(table);
	
     String id="";
	String name= "";
	 String  medstock="";
	String medtype = "";
	String medprice="";
	try
	{ 
	Class.forName("com.mysql.jdbc.Driver"); 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
	String sql = "SELECT * from Medicine";
    PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	int i =0;
	while(rs.next())
	{
	id = Integer.toString(rs.getInt("med_id"));
	name = rs.getString("med_name");
	medstock =Integer.toString( rs.getInt("med_stock"));
	medtype = rs.getString("med_type"); 
	medprice = Integer.toString(rs.getInt("med_price"));
    model.addRow(new Object[]{id, name, medstock,medtype,medprice});
   
	i++; 
	}

	}
	catch(Exception ex)
	{
	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
	JOptionPane.ERROR_MESSAGE);
	}
	f1.add(scroll);
	f1.setVisible(true);
	f1.setSize(800,500);
	}
	public void pay_table()
	{
		f1.setVisible(false);
		f2=new JFrame();
		f2.setLayout(null);f2.add(cardl);
		f2.setSize(600,700);f2.add(card1);f2.add(pay_cvv);
		f2.setVisible(true);f2.add(back_pay);f2.add(total1);
		f2.add(confirm);

		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames1);
		table = new JTable();
		table.setModel(model); 
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(0, 0, 600, 200);
		f2.getContentPane().add(scroll);
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		scroll.setViewportView(table);
		for(medicine obj :m1)
		   {
			  int temp_cost=obj.med_stock*obj.med_price;
			  total=total+temp_cost;
			  model.addRow(new Object[]{obj.med_name, Integer.toString(obj.med_stock), obj.med_type,
			  Integer.toString(obj.med_price),Integer.toString(temp_cost)});
			   
			
		   }	
		
		total1.setText("TOTAL: " + Integer.toString(total));
		f2.add(scroll);
		customer c2=new customer();customer c1=new customer();
		c2=c1.view_profile(login_id);
		card1.setText("CARD no."+c2.card_no);
		
		 
	}
	public void history()
	{
		JLabel hist=new JLabel("Your history of orders");
		hist.setBounds(150,0,250,50);
		f1.setVisible(false);
		f3=new JFrame();
		f3.setLayout(null);
		f3.setSize(600,600);
		f3.setVisible(true);
		f3.add(hist);

		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames2);
		table = new JTable();
		table.setModel(model); 
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(0, 100, 600, 200);
		f3.getContentPane().add(scroll);
		
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		scroll.setViewportView(table);
		
		f3.add(scroll);
		
		try
		{ 
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","tiger");
		String sql = "SELECT * from orderr where cust_id=?";
		
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1,login_id);
		ResultSet rs = ps.executeQuery();
		
		int o_id=0,qty=0, price;
	
		while(rs.next())
		{
		o_id = rs.getInt("order_id");
		qty = rs.getInt("total_qty");
		
		price = rs.getInt("total_cost"); 
		
	    model.addRow(new Object[]{Integer.toString(o_id), Integer.toString(qty), Integer.toString(price),
	    		rs.getTime("order_time"),rs.getDate("order_date")});
	   
	    }
	   
		 
		

		}
		catch(Exception ex)
		{
		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		JOptionPane.ERROR_MESSAGE);
		}
		
	
		
	}


}

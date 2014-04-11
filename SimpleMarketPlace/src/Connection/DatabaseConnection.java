package Connection;
import java.sql.*;
import java.util.ArrayList;


public class DatabaseConnection {
	Connection con=null;
	static ResultSet rs;
	Statement stmt =  null;
	
	DatabaseConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab2part2","root","admin");
			stmt = con.createStatement();
			if (!con.isClosed())
				System.out.println("Successfully Connected!!!");
			} catch (SQLException e){
				e.printStackTrace();
			} catch (InstantiationException e){
				e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public String signUp(String UserName, String pwd, String email,String hpone,String wpone,String address) throws SQLException{
		String result="";
		int rowcount;
		try {
			String query= "INsert into customer (username,password,email,hpone,wpone,address) values ('"+UserName+"','"+pwd+"','"+email+"','"+hpone+"','"+wpone+"','"+address+"')";
		    rowcount = stmt.executeUpdate(query);
		    if(rowcount>0)
		    {
		    	result="true";
		    	System.out.println("Insert Successfull");
		    }
		    else
		    {
		    	result="false:the data could not be inserted into the databse";
		    }
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		con.close();
		
		return result;
		
		}
		
	public String login (String username,String password) throws SQLException{
		String result="";
		 ResultSet resultset;
		try{
			String query= "Select username from customer where  username='"+username+"' and  password='"+password+"'";
			resultset = stmt.executeQuery(query);
			if (resultset!=null)
			{
				result="true";
		    	System.out.println("Login Successfull");
			}
			else
		    {
		    	result="false";
		    	System.out.println("Login Successfull");
		    }
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		con.close();
		return result;
	}
	
	public String advertiseProduct(String category,String name,String model,int price,String user) throws SQLException{
		String result="";
		int rowcount;
		String username=user;
		try {
			String query= "INsert into product (category,name,model,price,username) values ('"+category+"','"+name+"','"+model+"','"+price+"','"+username+"')";
		    rowcount = stmt.executeUpdate(query);
		    if(rowcount>0)
		    {
		    	result="true";
		    	System.out.println("Insert Successfull");
		    }
		    else
		    {
		    	result="false:the data could not be inserted into the databse";
		    }
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		con.close();
		
		return result;
		
		}
	
	 public String[] fetchCategory() throws SQLException{
		    
			ResultSet resultset = null;
			String[] category = null;
			ArrayList<String> value = new ArrayList<String>();
			try {
				String query= "select distinct category from product";
			    resultset = stmt.executeQuery(query);
			    if(resultset!=null)
			    {
			    	
			    	System.out.println("Fetch Successfull");
			    }
			    else
			    {
			    	System.out.println("Fetch failed");
			    }
			    while(resultset.next()){ 
			    value.add(resultset.getString(1)); 
			    			     }
			    category = value.toArray(new String[value.size()]); 
			     
			} catch (SQLException e){
				e.printStackTrace();
			}
			
			
			con.close();
			return category;
	 }
	 
	 public String[] fetchProducts(String category) throws SQLException{
		    
			ResultSet resultset = null;
			String[] products = null;
			ArrayList<String> value = new ArrayList<String>();
			try {
				String query= "select name,id,model,price  from product where category='"+category+"'";
			    resultset = stmt.executeQuery(query);
			    if(resultset!=null)
			    {
			    	
			    	System.out.println("Fetch product Successfull");
			    }
			    else
			    {
			    	System.out.println("Fetch failed");
			    }
			    while(resultset.next()){ 
			    value.add(resultset.getString(1));
			    value.add(resultset.getString(2));
			    value.add(resultset.getString(3));
			    value.add(resultset.getString(4));
			    			     }
			    products = value.toArray(new String[value.size()]); 
			     
			} catch (SQLException e){
				e.printStackTrace();
			}
			
			
			con.close();
			return products;
	 }
	 public String addToCart(int id,String user) throws SQLException{
			String result="";
			int rowcount;
			String username=user;
			try {
				String query= "INsert into cart  (select name,id,model,price,'"+username+"' from product where id='"+id+"')";
			    rowcount = stmt.executeUpdate(query);
			    if(rowcount>0)
			    {
			    	result="true";
			    	System.out.println("Insert Successfull in cart");
			    }
			    else
			    {
			    	result="false:the data could not be inserted into the databse";
			    }
			} catch (SQLException e){
				e.printStackTrace();
			}
			
			con.close();
			
			return result;
			
			}
	 public String[] displayCart(String user) throws SQLException{
		    
			ResultSet resultset = null;
			String[] cart = null;
			String username=user;
			ArrayList<String> value = new ArrayList<String>();
			try {
				String query= "select name,id,model,price,username  from cart where username='"+username+"'";
			    resultset = stmt.executeQuery(query);
			    if(resultset!=null)
			    {
			    	
			    	System.out.println("Fetch cart Successfull");
			    }
			    else
			    {
			    	System.out.println("Fetch failed");
			    }
			    while(resultset.next()){ 
			    value.add(resultset.getString(1));
			    value.add(resultset.getString(2));
			    value.add(resultset.getString(3));
			    value.add(resultset.getString(4));
			    value.add(resultset.getString(5));
			    			     }
			    cart = value.toArray(new String[value.size()]); 
			     
			} catch (SQLException e){
				e.printStackTrace();
			}
			
			
			con.close();
			return cart;
	 }
	 public String removeCart(String username,int id) throws SQLException{
			String result="";
			int rowcount;
			
			try {
				String query= "delete from cart where username='"+username+"' and id='"+id+"'";
				rowcount = stmt.executeUpdate(query);
			    if(rowcount>0)
			    {
			    	result="true";
			    	System.out.println("Delete Successfull");
			    }
			    else
			    {
			    	result="false:the data could not be deleted from the cart";
			    }
			} catch (SQLException e){
				e.printStackTrace();
			}
			
			con.close();
			
			return result;
			
			}

	 
	}



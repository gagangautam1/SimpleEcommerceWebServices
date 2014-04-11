package Connection;
import java.sql.SQLException;
import javax.jws.WebService;


@WebService
public class Service {
DatabaseConnection db= new DatabaseConnection();
public String signUp(String username, String  pwd,String email,String hpone,String wpone,String address) throws SQLException
{
	System.out.println("Inside Sign Up");
	String result;
	
	result = db.signUp(username,pwd,email,hpone,wpone,address);
	return result;
}

public  String login(String username, String  pwd) throws SQLException
{
	System.out.println("Inside Login");
	String result;
	
	result=db.login(username, pwd);
	return result;
}

public String advertiseProduct(String category,String name,String model,int price,String user) throws SQLException
{
	System.out.println("Inside  Advertise");
	String result;
	
	result = db.advertiseProduct( category, name, model, price,user);
	return result;
}
public String[] fetchCategory() throws SQLException
{
	System.out.println("Inside  Fetch");
	String[] result;
	result = db.fetchCategory();
	return result;
}
public String[] fetchProducts(String category) throws SQLException
{
	System.out.println("Inside  Fetch of products");
	String[] result;
	result = db.fetchProducts(category);
	return result;
}
public String addToCart(int id,String user) throws SQLException
{
	System.out.println("Inside  addtocart");
	String result;
	
	result = db.addToCart( id ,user);
	return result;
}
public String[] displayCart(String user) throws SQLException
{
	System.out.println("Inside  Fetch of cart");
	String[] result;
	result = db.displayCart(user);
	return result;
}
public String removeCart(String username,int id) throws SQLException
{
	System.out.println("Inside  delete from cart");
	String result;
	
	result = db.removeCart( username,id );
	return result;
}
}

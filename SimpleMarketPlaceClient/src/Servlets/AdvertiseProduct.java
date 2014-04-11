package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connection.ServiceProxy;

/**
 * Servlet implementation class AdvertiseProduct
 */
public class AdvertiseProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdvertiseProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String qdone;
		try{
			String category=request.getParameter("category");
			System.out.println(category);
			String name=request.getParameter("name");
			System.out.println(name);
			String model=request.getParameter("model");
			System.out.println(model);
			String price1=request.getParameter("price");
			System.out.println(price1);
			int price=Integer.parseInt(price1);
			System.out.println(price);
			HttpSession session=request.getSession();
		    session.getAttribute("username");
		    String user=(String)session.getAttribute("username");
			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			qdone=proxy.advertiseProduct(category, name, model, price,user);
			
			if(qdone.substring(0,4).equals("true")){
				out.println("Successfully inserted product");
				response.sendRedirect("ProductCatalog1.jsp");
			}
			else
			{
				out.println(qdone.substring(6));
				out.println("\n <a href=\"Welcome.jsp\"><br> Go to welcome page and try again.</a>");
				
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}

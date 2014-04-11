package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Proxy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connection.ServiceProxy;

/**
 * Servlet implementation class addToCart
 */
public class addToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToCart() {
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
			String id1=request.getParameter("id");
			System.out.println(id1);
			int id=Integer.parseInt(id1);
			System.out.println(id);
			System.out.println("Ah Chak "+id);
			HttpSession session=request.getSession();
		    session.getAttribute("username");
		    String user=(String)session.getAttribute("username");

			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			qdone=proxy.addToCart(id,user);
			
			if(qdone.substring(0,4).equals("true")){
				
			response.sendRedirect("ProductCatalog1.jsp");
			}
			else
			{
				out.println(qdone.substring(6));
				out.println("insertion in cart failed");
				
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}


	



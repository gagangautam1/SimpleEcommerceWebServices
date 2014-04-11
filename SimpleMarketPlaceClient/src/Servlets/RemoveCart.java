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
 * Servlet implementation class RemoveCart
 */
public class RemoveCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCart() {
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
			String input=request.getParameter("cart");
			System.out.println(input);
		    String username=input.substring(1);
			System.out.println(username);
			String id1=request.getParameter("cart");
			int id=Integer.parseInt(id1);
			HttpSession session=request.getSession();
		    session.getAttribute("username");
		    String user=(String)session.getAttribute("username");
			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			qdone=proxy.removeCart(user,id);
			
			String[] qdone1;
			if(qdone.substring(0,4).equals("true")){
				out.println("Delete successfull");
				qdone1=proxy.displayCart(user);
				System.out.println("11111111");
				if(qdone1!=null){
					request.setAttribute("cart", qdone1);
					request.getRequestDispatcher("DisplayCart.jsp").forward(request, response);
				}
				else
				{
					out.println("\n <a href=\"ProductCatalog1.jsp\"><br> Item removed but culd not display cart.</a>");
				}
			}
			
			else
			{
				out.println(qdone.substring(6));
				out.println("\n <a href=\"login.jsp\"><br> Go to welcome page and try again.</a>");
				
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}

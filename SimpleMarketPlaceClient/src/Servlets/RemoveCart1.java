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
 * Servlet implementation class RemoveCart1
 */
public class RemoveCart1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCart1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
	    session.getAttribute("username");
	    String user=(String)session.getAttribute("username");
		
		String[] qdone;
		try{
			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			qdone=proxy.displayCart(user);
			System.out.println("11111111");
			if(qdone!=null){
				request.setAttribute("cart", qdone);
				request.getRequestDispatcher("RemoveCart.jsp").forward(request, response);
			}
			else
			{
				out.println("\n <a href=\"ProductCatalog1.jsp\"><br>Previous Action Failed</a>");
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

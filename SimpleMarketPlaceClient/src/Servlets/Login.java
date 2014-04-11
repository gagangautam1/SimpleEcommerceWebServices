package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connection.ServiceProxy;
/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
			String user=request.getParameter("user");
			System.out.println(user);
			String pass=request.getParameter("pass");
			System.out.println(pass);
			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			qdone=proxy.login(user,pass);
			HttpSession session=request.getSession();
			if(qdone.substring(0,4).equals("true")){
				session.setAttribute("username",user);
				out.println("Welcome To Simple Market Place"+ user);
				
				
				response.sendRedirect("Welcome2.jsp");
			}
			else
			{
				out.println(qdone.substring(6));
				out.println("\n <a href=\"login.jsp\"><br>Previous Login Failed</a>");
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}

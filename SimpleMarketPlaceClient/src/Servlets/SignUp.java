package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import Connection.ServiceProxy;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
			String email=request.getParameter("email");
			System.out.println(email);
			String hpone=request.getParameter("hpone");
			System.out.println(hpone);
			String wpone=request.getParameter("wpone");
			System.out.println(wpone);
			String address=request.getParameter("address");
			System.out.println(address);
			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service");
			qdone=proxy.signUp(user,pass,email,hpone,wpone,address);
			HttpSession session=request.getSession();
			if(qdone.substring(0,4).equals("true")){
				session.setAttribute("username",user);
				out.println("Welcome To Simple Market Place"+ user);
				
				response.sendRedirect("Welcome2.jsp");
			}
			else
			{
				out.println(qdone.substring(6));
				out.println("\n <a href=\"SignUp.jsp\"><br>Go Back To SignUp Again</a>");
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}

package controllerPackage;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beanPackage.RestaurantBean;
import daoPackage.RestaurantDAO;

public class RestaurantController extends HttpServlet{


		
		/**
		 * @author Nisarg
		 */
		private static final long serialVersionUID = -3406639230650685120L;
		public RestaurantController()
		{
			super();
		}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			super.doGet(req, resp);
		}

		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			//super.doPost(req, resp);
			
		
			String buttonValue=null;
			buttonValue=req.getParameter("button");
			
			if(buttonValue.equals("order")){
			String Username=null;
			String pwd=null;
			String Usertype=null;
			int returnValue=0;
			
			Username=req.getParameter("uName");
			pwd=req.getParameter("pass");
			Usertype=req.getParameter("button");
			
			try{
				RestaurantBean rBean=new RestaurantBean();
				rBean.setUsername(Username);
				rBean.setPwd(pwd);
				rBean.setUsertype(Usertype);
				
				returnValue=RestaurantDAO.Logging_in(rBean);
				
				
				if(returnValue==1){
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/adminLogin.jsp").forward(req, resp); // redirect to the admin page
					System.out.println("Admin Login Successful");
				}
				else if (returnValue==2){
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/guestLogin.jsp").forward(req, resp); // redirect to the restuarant page
					System.out.println("Guest Login Successful");
				}
				else{ 
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/LoginFailure.jsp").forward(req, resp); // route it to the error handler page
					System.out.println("Error Logging in");
					
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				}
			else if(buttonValue.equals("Guest"))
			{
				String Username=null;
				String pwd=null;
				String Usertype=null;
				int returnValue=0;
				
				Username=req.getParameter("uName");
				pwd=req.getParameter("pass");
				Usertype=req.getParameter("button");
				
				try{
					RestaurantBean lBean=new RestaurantBean();
					lBean.setUsername(Username);
					lBean.setPwd(pwd);
					lBean.setUsertype(Usertype);
					
					returnValue=RestaurantDAO.Logging_in(lBean);
					
					
					if(returnValue==1){
						getServletConfig().getServletContext().getRequestDispatcher("/JSP/guestLogin.jsp").forward(req, resp); // redirect to the admin page
						System.out.println("Admin Login Successful");
					}
					else if (returnValue==2){
						getServletConfig().getServletContext().getRequestDispatcher("/JSP/guestLogin.jsp").forward(req, resp); // redirect to the restuarant page
						System.out.println("Guest Login Successful");
					}
					else{ 
						getServletConfig().getServletContext().getRequestDispatcher("/JSP/LoginFailure.jsp").forward(req, resp); // route it to the error handler page
						System.out.println("Error Logging in");
						
					}
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					
					}
				
	
	}

	
	
}

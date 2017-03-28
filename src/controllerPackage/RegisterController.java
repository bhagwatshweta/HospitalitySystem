package controllerPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beanPackage.RegisterBean;
import daoPackage.RegisterDAO;
import controllerPackage.LoginController;

public class RegisterController extends HttpServlet{

	/**
	 * @author Nisarg
	 */
	private static final long serialVersionUID = -4159180832170751595L;
	public RegisterController()
	{
		super();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String buttonValue=null;
		buttonValue=req.getParameter("button");
		
		if(buttonValue.equals("Submit")){
		String uname=null;
		String dob=null;
		String email=null;
		String pass=null;
		String nationality=null;
		String User_type=null;
		int returnValue=0;
		
		uname=req.getParameter("uname");
		dob=req.getParameter("date")+"-"+req.getParameter("month")+"-"+req.getParameter("year");
		email=req.getParameter("email");
		pass=req.getParameter("pass");
		nationality=req.getParameter("nationality");
		User_type=req.getParameter("User_type");
		try{
			RegisterBean rBean=new RegisterBean();
			rBean.setUname(uname);
			rBean.setDob(dob);
			rBean.setEmail(email);
			rBean.setPass(pass);
			rBean.setNationality(nationality);
			rBean.setUser_type(User_type);
			returnValue=RegisterDAO.RegisterGuest(rBean);
			
			if(returnValue==1){
				System.out.println("Registration Successful");
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/Login.jsp").forward(req, resp);
			}
			else{
				System.out.println("Registration Failure");
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/registration.jsp").forward(req, resp);
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			}
	/*private GenericServlet getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	}

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
	
	RegisterBean rBean;*/
	
	

}

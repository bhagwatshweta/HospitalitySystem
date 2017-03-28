package controllerPackage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beanPackage.HotelBean;
import daoPackage.HotelDAO;



import controllerPackage.HotelController;
 

public class HotelController extends HttpServlet
{
	/**
	 * @author Nisarg
	 */
	
	int guestIDGlobal = 1;
	int exeRoom = 0;
	int delRoom=0;
	int standRoom=0;
	int suiteRoom=0;
	
	private static final long serialVersionUID = -2436623746589120681L;

	public HotelController()
	{
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
	
		String buttonValue=null;
		buttonValue=req.getParameter("button");
		
		if(buttonValue.equals("Create")){
		int guestId=0;
		String check=null;
		String firstName=null;
		String lastName=null;
		String contactNo=null;
		String gender=null;
		String dob=null;
		String room=null;
		String guestNo=null;
		int returnValue=0;
		int go=0;
		
		
		
		
		//guestId=Integer.toString(guestIDGlobal+1);
		//guestIDGlobal++;
		//guestId=req.getParameter("guestId");
		firstName=req.getParameter("firstName");
		lastName=req.getParameter("lastName");
		contactNo=req.getParameter("contactNo");
		gender=req.getParameter("Gender");
		dob=req.getParameter("date")+"-"+req.getParameter("month")+"-"+req.getParameter("year");
		room=req.getParameter("room");
		guestNo=req.getParameter("guestNo");
		
		
		
		
		
		try{
			HotelBean eBean=new HotelBean();
			eBean.setGuestId(guestId);
			eBean.setFirstName(firstName);
			eBean.setLastName(lastName);
			eBean.setGender(gender);
			eBean.setDob(dob);
			eBean.setRoom(room);
			eBean.setGuestNo(guestNo);
			eBean.setContactNo(contactNo);
			
		
			HotelDAO.getGuestIdCount(eBean);
			
			exeRoom=HotelDAO.getExeRoomCount(eBean);
			delRoom=HotelDAO.getDeluxeRoomCount(eBean);
			standRoom=HotelDAO.getStandardRoomCount(eBean);
			suiteRoom=HotelDAO.getSuiteRoomCount(eBean);
			if(exeRoom>=4 && room=="Executive")
			{
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationFailure.jsp").forward(req, resp);
				System.out.println("ERooms Full!");
				go=1;
			}
			
			else if(delRoom>=4 && room=="Deluxe")
			{
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationFailure.jsp").forward(req, resp);
				System.out.println("DRooms Full!");
				go=1;
			}
			else if(standRoom>=4 && room=="Standard")
			{
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationFailure.jsp").forward(req, resp);
				System.out.println("STRooms Full!");
				go=1;
			}
			
			else if(suiteRoom>=5 && room=="Presidential Suite")
			{
				System.out.println("\n"+suiteRoom+"\n");
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationFailure.jsp").forward(req, resp);
				System.out.println("SRooms Full!");
				go=1;
			}
			else if(go==0)
				{
				returnValue=HotelDAO.createGuest(eBean);
				
			
				if(returnValue==1){
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationSuccess.jsp").forward(req, resp);
				}
				else
				{
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationFailure.jsp").forward(req, resp);
				}
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
		
		if(buttonValue.equals("Delete"))
		{
			
			int guestId=0;
			int returnValue=0;
			guestId=Integer.parseInt(req.getParameter("guestId"));
			try
			{
			HotelBean eBean=new HotelBean();
			eBean.setGuestId(guestId);
			
			returnValue=HotelDAO.deleteGuest(eBean);
			
			if(returnValue==1){
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/DeleteSuccess.jsp").forward(req, resp);
			}
			else{
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/DelteFailure.jsp").forward(req, resp);
			}
			}
			catch(Exception e){

				System.out.println(e);
			}
		}
			
if(buttonValue.equals("Update")){
			
			int guestId=0;
			String fName=null;
			String lName=null;
			String contactNo=null;
			String room=null;
			int returnValue=0;
			
			guestId=Integer.parseInt(req.getParameter("guestId"));
			fName=req.getParameter("firstName");
			lName=req.getParameter("lastName");
			contactNo=req.getParameter("contactNo");
			room=req.getParameter("room");
			System.out.println(guestId);
			try{
			HotelBean eBean=new HotelBean();
			eBean.setGuestId(guestId);
			eBean.setFirstName(fName);
			eBean.setLastName(lName);
			eBean.setContactNo(contactNo);
			eBean.setRoom(room);

			returnValue=HotelDAO.updateGuest(eBean);
			if(returnValue==1){
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/UpdateSuccess.jsp").forward(req, resp);
			}
			else{
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/UpdateFailure.jsp").forward(req, resp);
			}
			}
			catch(Exception e){
				System.out.println(e);
			}
			}

		if(buttonValue.equals("View")){
			
			int guestId=0;
			String returnValue=null;
			guestId=Integer.parseInt(req.getParameter("guestId"));
			try{
			HotelBean eBean=new HotelBean();
			eBean.setGuestId(guestId);
			
			eBean=HotelDAO.viewGuest(eBean);
			returnValue=eBean.getFirstName();
			req.setAttribute("gue", eBean.getGuestId());
			req.setAttribute("fNam", eBean.getFirstName());
			req.setAttribute("lNam",eBean.getLastName());
			req.setAttribute("con", eBean.getContactNo());
			req.setAttribute("gen",eBean.getGender());
			req.setAttribute("dob",eBean.getDob());
			req.setAttribute("roo",eBean.getRoom());
			req.setAttribute("gNo",eBean.getGuestNo());
			if(returnValue==null){
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/ViewFailure.jsp").forward(req, resp);
				
			}
			else{
				getServletConfig().getServletContext().getRequestDispatcher("/JSP/ViewGuestDisplay.jsp").forward(req, resp);
			}
			}
			catch(Exception e){

				System.out.println(e);
			}
		}
		
		
		if(buttonValue.equals("Book")){
			int guestId=0;
			
			String firstName=null;
			String lastName=null;
			String contactNo=null;
			String gender=null;
			String dob=null;
			String room=null;
			String guestNo=null;
			int returnValue=0;
			
			
			
			
			//guestId=Integer.toString(guestIDGlobal+1);
			//guestIDGlobal++;
			//guestId=req.getParameter("guestId");
			firstName=req.getParameter("firstName");
			lastName=req.getParameter("lastName");
			contactNo=req.getParameter("contactNo");
			gender=req.getParameter("Gender");
			dob=req.getParameter("date")+"-"+req.getParameter("month")+"-"+req.getParameter("year");
			room=req.getParameter("room");
			guestNo=req.getParameter("guestNo");
			
			
			try{
				HotelBean eBean=new HotelBean();
				eBean.setGuestId(guestId);
				eBean.setFirstName(firstName);
				eBean.setLastName(lastName);
				eBean.setGender(gender);
				eBean.setDob(dob);
				eBean.setRoom(room);
				eBean.setGuestNo(guestNo);
				eBean.setContactNo(contactNo);
				HotelDAO.getGuestIdCount(eBean);
				returnValue=HotelDAO.createGuest(eBean);
				
				if(returnValue==1){
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationSuccess.jsp").forward(req, resp);
				}
				else{
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationFailure.jsp").forward(req, resp);
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				}
		
		
		
		
		
		
		
		//For Online guest booking
//		if(buttonValue.equals("Book")){
//			int guestId=0;
//			String firstName=null;
//			String lastName=null;
//			String contactNo=null;
//			String gender=null;
//			String dob=null;
//			String room=null;
//			String guestNo=null;
//			int returnValue=0;
//			
//			//guestId=req.getParameter("guestId");
//			guestIDGlobal++;
//			guestId=guestIDGlobal;
//		
//			firstName=req.getParameter("firstName");
//			lastName=req.getParameter("lastName");
//			contactNo=req.getParameter("contactNo");
//			gender=req.getParameter("Gender");
//			dob=req.getParameter("date")+"-"+req.getParameter("month")+"-"+req.getParameter("year");
//			room=req.getParameter("room");
//			guestNo=req.getParameter("guestNo");
//			try{
//				HotelBean eBean=new HotelBean();
//				eBean.setGuestId(guestId);
//				eBean.setFirstName(firstName);
//				eBean.setLastName(lastName);
//				eBean.setGender(gender);
//				eBean.setDob(dob);
//				eBean.setRoom(room);
//				eBean.setGuestNo(guestNo);
//				eBean.setContactNo(contactNo);
//				returnValue=HotelDAO.createGuest(eBean);
//				
//				if(returnValue==1){
//					getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationSuccess.jsp").forward(req, resp);
//				}
//				else{
//					getServletConfig().getServletContext().getRequestDispatcher("/JSP/CreationFailure.jsp").forward(req, resp);
//				}
//				}
//				catch(Exception e)
//				{
//					System.out.println(e);
//				}
//				}
}
	

}

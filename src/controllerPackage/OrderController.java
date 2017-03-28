package controllerPackage;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.RootPaneUI;

import beanPackage.HotelBean;
import beanPackage.OrderBean;
import daoPackage.HotelDAO;
import daoPackage.OrderDAO;

public class OrderController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int guestIDGlobal = 1;
	int exeRoom = 0;
	int delRoom = 0;
	int standRoom = 0;
	int suiteRoom = 0;

	public OrderController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String buttonValue = null;
		buttonValue = req.getParameter("button");
		int returnValue = 0;

		if (buttonValue.equals("order")) {
			// int guestId=0;
			String check = null;
			String firstName = null;
			String lastName = null;
			String contactNo = null;
			String gender = null;
			String dob = null;
			String room = null;
			String guestNo = null;
			String[] food=null;
			int rotiQty=0,biriyaniQty=0,curryQty=0;
			//int returnValue = 0;
			int go = 0;

			// guestId=Integer.toString(guestIDGlobal+1);
			// guestIDGlobal++;
			// guestId=req.getParameter("guestId");
			firstName = req.getParameter("firstName");
			//lastName = req.getParameter("lastName");
			contactNo = req.getParameter("contactNo");
			//gender = req.getParameter("Gender");
			//dob = req.getParameter("date") + "-" + req.getParameter("month") + "-" + req.getParameter("year");
			//room = req.getParameter("room");
			guestNo = req.getParameter("guestNo");
			food = req.getParameterValues("food");
			List itemordered = new ArrayList();
			List qty = new ArrayList();
			float finalbill = 0.0f;
			for(String s : food)
			{
				if(s.equals("roti"))
				{
					
					rotiQty = Integer.parseInt(req.getParameter("qt1"));
					itemordered.add("roti");
					qty.add(rotiQty);
					finalbill+= rotiQty *1.5;
				}
				if(s.equals("curry"))
				{
					curryQty =Integer.parseInt(req.getParameter("qt2"));
					itemordered.add("curry");
					qty.add(curryQty);
					finalbill+= curryQty *8.5;
				}
				if(s.equals("biriyani"))
				{
					biriyaniQty = Integer.parseInt(req.getParameter("qt3"));
					itemordered.add("biriyani");
					qty.add(biriyaniQty);
					finalbill+= curryQty *8.5;
				}
			}
			
			try{
				OrderBean oBean=new OrderBean();
				firstName="tejas";
				oBean.setGuestName(firstName);
				contactNo ="4545454545";
				oBean.setContactNo(contactNo);
				oBean.setItemordered(itemordered);	
				oBean.setQuantity(qty);
				oBean.setTableNo(1);
				oBean.setBillamount(finalbill);
				//OrderDAO.getGuestIdCount(eBean);
				System.out.println("final bill is :" + oBean.getBillamount());
				if(finalbill>0)
				{
					returnValue=OrderDAO.insertOrder(oBean);
					//Cookie ck = new Cookie("OrderID", ""+returnValue);
					//resp.addCookie(ck);
					if(returnValue ==1){
					getServletConfig().getServletContext().getRequestDispatcher("/JSP/OrderPlaced.jsp").forward(req, resp);
					}
					System.out.println("Order Placed!");
					go=1;
				}
				
							}
				catch(Exception e)
				{
					System.out.println(e);
				}

		}
	}
}
package daoPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import beanPackage.HotelBean;
import beanPackage.OrderBean;
import hotelUtil.DBUtil;

public class OrderDAO {

	
	public static int insertOrder(OrderBean oBean) throws SQLException{
		

		Connection con=null;
		Statement stmt=null;
		String sqlStr=null;
		int returnValue=0;
		String Items="";
		if(oBean.getItemordered().size()>0)
		{
			for(int i=0; i<oBean.getItemordered().size();i++)
			{
				Items += "" + oBean.getItemordered().get(i)+","; 
			}
		}
		String qty="";
		if(oBean.getQuantity().size()>0)
		{
			for(int i=0; i<oBean.getQuantity().size();i++)
			{
				qty += "" + oBean.getQuantity().get(i)+","; 
			}
		}
		System.out.println("items list" +oBean.getItemordered());
		System.out.println("item:" + Items);
		System.out.print("Qty:" + qty);
		try{
			con=DBUtil.createConnetion();
			stmt=con.createStatement();
			sqlStr="insert into Order_Details values('"+oBean.getGuestName()+"','"+oBean.getContactNo()+"','"+Items+"','"+qty+"','"+oBean.getBillamount()+"')";
			System.out.println(sqlStr);
			
			//returnValue=stmt.executeUpdate(sqlStr,Statement.RETURN_GENERATED_KEYS );
			returnValue=stmt.executeUpdate(sqlStr);
			 //ResultSet rs = stmt.getGeneratedKeys();
			 //if (rs.next()) {
				// returnValue = rs.getInt(1);
				 //System.out.println("OrderID : "+ rs.getInt(1));
			   // }
		}
		catch(Exception e){
			System.out.println(e);

		}
		finally{
			con.close();
			stmt.close();
			System.out.println("Connetions Closed");
			System.out.println("value:" + returnValue);
		}
		return returnValue;
	}

	
}

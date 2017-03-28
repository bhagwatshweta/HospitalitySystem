package daoPackage;
import beanPackage.HotelBean;
import hotelUtil.DBUtil;
import java.sql.*;

import beanPackage.HotelBean;

public class HotelDAO 
{
	/**
	 * @author Nisarg
	 */
	
	static int standardCount = 25;
	static int deluxeCount = 25;
	static int executiveCount = 20;
	static int SuiteCount = 5;
	
	public static int createGuest(HotelBean eBean) throws SQLException{
		

		Connection con=null;
		Statement stmt=null;
		Statement stmt1=null;
		String sqlStr=null;
		String sqlStr1=null;
		ResultSet rs1=null;
		int returnValue=0;
		int globalGuestId=0;
		System.out.println(eBean.getRoom());
		try{
//			if(eBean.getRoom()=="Standard")
//			{
//				if(standardCount==0)
//				{
//					returnValue=0;
//					return returnValue;
//				}
//			}
//			else if(eBean.getRoom()=="Deluxe")
//			{
//				if(deluxeCount==0)
//				{
//					returnValue=0;
//					return returnValue;
//				}
//			}
//			else if(eBean.getRoom()=="Executive")
//			{
//				if(executiveCount==0)
//				{
//					returnValue=0;
//					return returnValue;
//				}
//			}
//			else if(eBean.getRoom()=="Presidential Suite")
//			{
//				System.out.println(eBean.getRoom());
//				System.out.println("\n"+SuiteCount);
//				if(SuiteCount==0)
//				{
//					returnValue=0;
//					System.out.println("\n"+SuiteCount);
//					return returnValue;
//				}
//			}
			if(standardCount==0 && deluxeCount==0 && executiveCount==0 && SuiteCount==0)
			{
				returnValue=2;
				return returnValue;
			}
			else{
			
			
			con=DBUtil.createConnetion();
			stmt=con.createStatement();
			sqlStr="insert into HotelGuests values('"+eBean.getGuestId()+"','"+eBean.getFirstName()+"','"+eBean.getLastName()+"','"+eBean.getGender()+"','"+eBean.getDob()+"','"+eBean.getRoom()+"','"+eBean.getGuestNo()+"','"+eBean.getContactNo()+"')";
			System.out.println(sqlStr);
			if(eBean.getRoom()=="Standard")
			{
				standardCount--;
			}
			else if(eBean.getRoom()=="Deluxe")
			{
				deluxeCount--;
				
			}
			else if(eBean.getRoom()=="Executive")
			{
				executiveCount--;
			}
			else if(eBean.getRoom()=="Presidential Suite")
			{
				SuiteCount--;
			}
			returnValue=stmt.executeUpdate(sqlStr);			
			}
		}
		catch(Exception e){
			System.out.println(e);

		}
		finally{
			con.close();
			stmt.close();
			System.out.println("Connetions Closed");
		}
		return returnValue;
	}
	
public static int deleteGuest(HotelBean eBean) throws SQLException{
		

		Connection con=null;
		Statement stmt=null;
		int guestId=0;
		String sqlStr=null;
		int returnValue=0;
		try{
			con=DBUtil.createConnetion();
			stmt=con.createStatement();
			guestId=eBean.getGuestId();
			sqlStr="delete from HotelGuests where GuestID='"+guestId+"'";
			returnValue=stmt.executeUpdate(sqlStr);	
		}
		catch(Exception e){
			System.out.println(e);


		}
		finally{
			con.close();
			stmt.close();
			System.out.println("Connetions Closed");
		}
		return returnValue;
		
	}
public static int updateGuest(HotelBean eBean) throws SQLException{
	

	Connection con=null;
	Statement stmt=null;
	String sqlStr=null;
	int returnValue=0;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		sqlStr="update HotelGuests set FirstName='"+eBean.getFirstName()+"', LastName='"+eBean.getLastName()+"',ContactNo='"+eBean.getContactNo()+"', Room='"+eBean.getRoom()+"' where GuestID='"+eBean.getGuestId()+"'";
		System.out.println(sqlStr);

		returnValue=stmt.executeUpdate(sqlStr);			

	}
	catch(Exception e){
		System.out.println(e);

	}
	finally{
		con.close();
		stmt.close();
		System.out.println("Connetions Closed");
	}
	return returnValue;
}

public static HotelBean viewGuest(HotelBean eBean) throws SQLException{
	

	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	int guestId=0;
	String sqlStr=null;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		guestId=eBean.getGuestId();
		sqlStr="select * from HotelGuests where GuestID='"+guestId+"'";
		rs=stmt.executeQuery(sqlStr);	
		while(rs.next()){
			
			eBean.setGuestId(rs.getInt(1));
			eBean.setFirstName(rs.getString(2));
			eBean.setLastName(rs.getString(3));
			eBean.setGender(rs.getString(4));
			eBean.setDob(rs.getString(5));
			eBean.setRoom(rs.getString(6));
			eBean.setGuestNo(rs.getString(7));
			eBean.setContactNo(rs.getString(8));
			
			System.out.println(rs.getString(2));
		}
	}
	catch(Exception e){
		System.out.println(e);


	}
	finally{
		con.close();
		stmt.close();
		rs.close();
		System.out.println("Connections Closed");
	}
	return eBean;
	
}

public static HotelBean getGuestIdCount(HotelBean eBean) throws SQLException{
	

	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	int guestId=0;
	String sqlStr=null;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		
		sqlStr="select MAX(GuestID) from HotelGuests";
		//sqlStr="SELECT GuestId FROM HotelGuests WHERE ROWNUM <=1 ORDER BY GuestID DESC;";
	    //sqlStr="select GuestId from HotelGuests where GuestID=(select max(GuestID) from HotelGuests);";
		
		rs=stmt.executeQuery(sqlStr);
		System.out.println(sqlStr);
		
		System.out.println(rs);
		while(rs.next())
		{
		guestId=rs.getInt(1);
		System.out.println("\n"+guestId);
		eBean.setGuestId(rs.getInt(1)+1);
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		con.close();
		stmt.close();
		rs.close();
		System.out.println("Connections Closed");
	}
	return eBean;
	
}



public static int getExeRoomCount(HotelBean eBean) throws SQLException{
	

	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	int guestId=0;
	int deluxeCount=0;
	int exeCount=0;
	int standardCount=0;
	int suiteCount=0;
	String sqlStr=null;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		
		sqlStr="SELECT COUNT(ROOM) FROM HOTELGUESTS WHERE ROOM ='Executive'";
		
		rs=stmt.executeQuery(sqlStr);
		System.out.println(sqlStr);
		
		
		while(rs.next())
		{
			exeCount=rs.getInt(1);
			
		System.out.println("\n"+exeCount);
		//eBean.setGuestId(rs.getInt(1)+1);
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		con.close();
		stmt.close();
		rs.close();
		System.out.println("Connections Closed");
	}
	return exeCount;
	
}


public static int getDeluxeRoomCount(HotelBean eBean) throws SQLException{
	

	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	int guestId=0;
	int deluxeCount=0;
	//int exeCount=0;
	int standardCount=0;
	int suiteCount=0;
	String sqlStr=null;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		
		sqlStr="SELECT COUNT(ROOM) FROM HOTELGUESTS WHERE ROOM ='Deluxe'";
		
		rs=stmt.executeQuery(sqlStr);
		System.out.println(sqlStr);
		
		
		while(rs.next())
		{
			deluxeCount=rs.getInt(1);
			
		System.out.println("\n"+deluxeCount);
		//eBean.setGuestId(rs.getInt(1)+1);
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		con.close();
		stmt.close();
		rs.close();
		System.out.println("Connections Closed");
	}
	return deluxeCount;
	
}

public static int getStandardRoomCount(HotelBean eBean) throws SQLException{
	

	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	int guestId=0;
	
	//int exeCount=0;
	int standardCount=0;
	int suiteCount=0;
	String sqlStr=null;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		
		sqlStr="SELECT COUNT(ROOM) FROM HOTELGUESTS WHERE ROOM ='Standard'";
		
		rs=stmt.executeQuery(sqlStr);
		System.out.println(sqlStr);
		
		
		while(rs.next())
		{
			standardCount=rs.getInt(1);
			
		System.out.println("\n"+standardCount);
		//eBean.setGuestId(rs.getInt(1)+1);
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		con.close();
		stmt.close();
		rs.close();
		System.out.println("Connections Closed");
	}
	return standardCount;
	
}

public static int getSuiteRoomCount(HotelBean eBean) throws SQLException{
	

	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	int guestId=0;
	int deluxeCount=0;
	//int exeCount=0;
	int standardCount=0;
	int suiteCount=0;
	String sqlStr=null;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		
		sqlStr="SELECT COUNT(ROOM) FROM HOTELGUESTS WHERE ROOM ='Presidential Suite'";
		
		rs=stmt.executeQuery(sqlStr);
		System.out.println(sqlStr);
		
		
		while(rs.next())
		{
			suiteCount=rs.getInt(1);
			
		System.out.println("\n"+suiteCount);
		//eBean.setGuestId(rs.getInt(1)+1);
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally{
		con.close();
		stmt.close();
		rs.close();
		System.out.println("Connections Closed");
	}
	return suiteCount;
	
}


}

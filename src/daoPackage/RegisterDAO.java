package daoPackage;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import hotelUtil.DBUtil;
import beanPackage.RegisterBean;
import controllerPackage.RegisterController;
public class RegisterDAO {
	/**
	 * @author Nisarg
	 */
	public static int RegisterGuest(RegisterBean rBean) throws SQLException{
	Connection con=null;
	Statement stmt=null;
	String sqlStr=null;
	int returnValue=0;
	try{
		con=DBUtil.createConnetion();
		stmt=con.createStatement();
		sqlStr="insert into Logindetails values('"+rBean.getUname()+"','"+rBean.getDob()+"','"+rBean.getEmail()+"','"+rBean.getPass()+"','"+rBean.getNationality()+"','"+rBean.getUser_type()+"')";
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

}

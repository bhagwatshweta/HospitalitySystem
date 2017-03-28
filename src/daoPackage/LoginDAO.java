package daoPackage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.eclipse.jdt.internal.compiler.ast.Statement;

import beanPackage.LoginBean;
import hotelUtil.DBUtil;

public class LoginDAO {
	/**
	 * @author Nisarg
	 */
	public static int Logging_in(LoginBean lBean) throws SQLException{
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String Username=null;
		String pwd=null;
		String Usertype=null;
		String sqlStr=null;
		int returnValue=0;
		try{
			con=DBUtil.createConnetion();
			stmt=con.createStatement();
			Username=lBean.getUsername();
			pwd=lBean.getPwd();
			Usertype=lBean.getUsertype();
			sqlStr="select * from Logindetails where uname='"+Username+"'";
			//returnValue=stmt.executeUpdate(sqlStr);
			System.out.println(sqlStr);
			rs=stmt.executeQuery(sqlStr);
			System.out.println("Select query from Logindetails executed successfully");
			while(rs.next()){
				String passwd=(rs.getString(4));
				String UTypeinDatabase=(rs.getString(6));
				if((pwd.equals(passwd)) && Usertype.equals(UTypeinDatabase))
				{
					System.out.println("Admin Login Success!");
					returnValue=1;
				}
				else if((pwd.equals(passwd)) && Usertype.equals(UTypeinDatabase))
				{
					System.out.println("Guest Login Success!");
					returnValue=2;
				}
				else
				{
					System.out.println("Invalid Credentials!");
					returnValue=0;
				}
				System.out.println(rs.getString(4));
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
		return returnValue;
	}
}

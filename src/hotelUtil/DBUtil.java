package hotelUtil;
import java.sql.*;
public class DBUtil 
{
	/**
	 * @author Nisarg
	 */
		public static Connection createConnetion() throws Exception
		{
			Connection conn=null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@prophet.njit.edu:1521:course", "nbg7","pulsar87");
			System.out.println("Connection Established");
			return conn;
		}
	}
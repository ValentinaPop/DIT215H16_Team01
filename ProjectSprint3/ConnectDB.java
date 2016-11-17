package DIT215H16_Team01;
import java.sql.*;	
public class ConnectDB {
	public	static	void	main(	String	args[]	)	{
		
			try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			}	catch (Exception	ex)	{
//				handle	errors
			}
		Connection	conn =	null;
		String	uri = "jdbc:mysql://leia.skip.chalmers.se:3306/team_01";
		String	username =	"team_01";
		String	password ="yOZGjlGknjwdiG4B";
		try {
		conn = DriverManager.getConnection(uri,	username,	password);
		
		}	
		
		catch (SQLException ex)	{
//			handle	errors
		}
		
		
		//Execute a SELECT statement
		 
		String sql = "SELECT * FROM TrailerPark;";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); 
		// do something with ResultSet(SEE NEXT SLIDE)
			
			while (rs.next() ) {         
				String title = rs.getString("Title");
				System.out.println
				("Title= " + title );
			}
			
		}
		catch (SQLException ex){
		// handle errors
	
		}
		finally
		{
		// release resources with rs.close() and stmt.close()
		}
		
			
}
}

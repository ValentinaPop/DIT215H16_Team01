package Project ;

import java.sql.* ;

public class Update_Data {
		
	public static void main( String[] args ) {
	
		try {
			//1. Get a connection to database
			java.sql.Connection conn = DriverManager.getConnection( "jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B" ) ;
			
			//2. Create a statement
			Statement stm = conn.createStatement() ;
			
			//3. Execute SQL query
			
			String sql = "update TrailerPark " + "set ..." + "where ..." ;  
			stm.executeUpdate(sql) ;
			
			System.out.println( "Update complete." ) ;
		
		} 
		catch ( Exception ex ) {
			ex.printStackTrace() ;
		} 
		
	}
}

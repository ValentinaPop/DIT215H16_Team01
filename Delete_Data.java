package Project ;

import java.sql.* ;

public class Delete_Data {
		
	public static void main( String[] args ) {
	
		try {
			//1. Get a connection to database
			java.sql.Connection conn = DriverManager.getConnection( "jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B" ) ;
			
			//2. Create a statement
			Statement stm = conn.createStatement() ;
			
			//3. Execute SQL query
			
			String sql = "DELETE FROM `TrailerPark` WHERE = ' ' " ;
			int rowsAffected = stm.executeUpdate(sql) ;
			System.out.println( "Rows affected: " + rowsAffected ) ;
			System.out.println( "Delete complete." ) ;
			
		} 
		catch ( Exception ex ) {
			ex.printStackTrace() ;
			 
		}
	}
}

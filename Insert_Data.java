package Project ;

import java.sql.* ; 

public class Insert_Data {
	
	public static void main( String[] args ) {
		
		try {
			//1. Get a connection to database
			java.sql.Connection conn = DriverManager.getConnection( "jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B" ) ;
			
			//2. Create a statement
			Statement stm = conn.createStatement() ;
			
			//3. Execute SQL query
			String sql = "insert into TrailerPark " + "(Title, Length, Director, Studio, Release, Language, Age restriction, Description of the movie, Based on, Picture, Comment, Rate, Trailer)" 
					+ "values ( , , , , , , , , , , , , )" ; 
			stm.executeUpdate(sql);
			
			System.out.println("Insertion completed.");
		} 
		catch ( Exception ex ) {
			ex.printStackTrace() ;
		}
	}	
}


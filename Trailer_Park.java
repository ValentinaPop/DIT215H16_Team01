package Project ;

import java.sql.* ;
import java.util.Scanner;

public class Trailer_Park {
	
	public static void main( String[] args ) {
		
		Scanner input = new Scanner(System.in) ;
		Scanner input1 = new Scanner(System.in) ;
		int choice ;
		//Pushing is FUN:)
		try {
			java.sql.Connection conn = DriverManager.getConnection( "jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B" ) ;
			
			Statement stm = conn.createStatement() ;
			
			System.out.println("+**********************************************************+") ;
			System.out.println("*                                                          *") ;
			System.out.println("*                       Trailer Park                       *") ;
			System.out.println("*                                                          *") ;
			System.out.println("+**********************************************************+" + "\n") ;
			
			do {
				do { 					
					System.out.println( "\n" + "MAIN MENU" + "\n" + "\n" + "1: List of movies" + "\n" + "2: Search by Title" + "\n" +
										"3: Exit" + "\n" + "Enter a choice: " ) ;
					choice = input.nextInt() ;	
					
				}while( choice != 1 && choice != 2 && choice != 3 ) ;
				
				
				switch ( choice ) {
				
				case 1:	
					ResultSet rs = stm.executeQuery( "SELECT * FROM `TrailerPark`" ) ;
					
					while ( rs.next() ) {
						System.out.println( "Title: " + rs.getString("Title") + "\n" + "Release day: " + rs.getDate("Release") + "\n" + "Language: " + rs.getString("Language") + "\n" +
								"Director: " + rs.getString("Director") + "\n" + "Studio: " + rs.getString("Studio") + "\n" + "Length: " + rs.getString("Length") 
								+ "\n" + "Age restriction: " + rs.getString("Age restriction") + "\n" + "Picture: " + rs.getBlob("Picture") + "\n" 
								+ "Description: " + rs.getString("Description of the movie") + "\n" ) ;
					}
					break ;
					
				case 2:
					System.out.print( "Enter the Title: " ) ;
					String title = input1.nextLine() ;
					
					ResultSet rs1 = stm.executeQuery( "SELECT * FROM `TrailerPark` WHERE title REGEXP '[[:<:]]" + title + "[[:>:]]'" ) ;
					
					while ( rs1.next() ) {
						System.out.println( "\n" + "Title: " + rs1.getString("Title") + "\n" + "Release day: " + rs1.getDate("Release") + "\n" + "Language: " + rs1.getString("Language") + "\n" +
								"Director: " + rs1.getString("Director") + "\n" + "Studio: " + rs1.getString("Studio") + "\n" + "Length: " + rs1.getString("Length") 
								+ "\n" + "Age restriction: " + rs1.getString("Age restriction") + "\n" + "Picture: " + rs1.getBlob("Picture") + "\n" 
								+ "Description: " + rs1.getString("Description of the movie") + "\n" ) ;
					}
					break ;
				
				case 3:
					System.out.println( "Thanks for your visit!" ) ;
					break ;
				}
				
			}while ( choice != 3 ) ;
		} 
		
		catch ( Exception ex ) {
			ex.printStackTrace() ;
		} 
	}
}

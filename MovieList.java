package connection;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class MovieList {
	 public static ArrayList<Movie> movieList = new ArrayList<>();
	 public static int nrOfMovies = 0;
	 
	public ArrayList<Movie> setMovieList(Movie input){		
		
		 try {
					java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B");

					Statement stm = conn.createStatement();
					
			
					//////////////////////////////// inputGuery
					/* First we save all the values we get from user in array as a conditions. That way we can easily add Strings in a query.
					 * We have to add also a word 'and' between  the conditions.
					 * We save the query as a String "where" which we then add to the "Select query"
					 */
						String [] attributes = new String [9];
						int n = 0;
						
						//Title
						if (!(input.getTitle().equals(""))){
							attributes[n] = "Title REGEXP '[[:<:]]" + input.getTitle() + "[[:>:]]'";
							n++;
						}
						
						//Language
						if (!(input.getLanguage().equals(""))){
							attributes[n] = "Language REGEXP '[[:<:]]" + input.getLanguage() + "[[:>:]]'";
							n++;
						}
						
						//Year
						if (!(input.getYear() == 0)){
							attributes[n] = "Release REGEXP '[[:<:]]" + input.getYear() + "[[:>:]]'";
							n++;
						}
						
						//Director
						if (!(input.getDirector().equals(""))){
							attributes[n] = "Director REGEXP '[[:<:]]" + input.getDirector() + "[[:>:]]'";
							n++;
						}
						
						//Actor 
						//if (!(input.getActor().equals(""))){
						//	attributes[n] = "Actor REGEXP '[[:<:]]" + input.getActors() + "[[:>:]]'";
						//	n++;
						//}
						
						//Rating
						if (!(input.getAverageRate()== 0)){
							attributes[n] = "Rate REGEXP '[[:<:]]" + input.getAverageRate() + "[[:>:]]'";
							n++;
						}
						
						//Length
						if (!(input.getRuntime().equals(""))){
							attributes[n] = "Length REGEXP '[[:<:]]" + input.getRuntime() + "[[:>:]]'";
							n++;	
						}
						
						//Genre
						//if (!(input.getGenres().equals(""))){
						//	attributes[n] = "Genre REGEXP '[[:<:]]" + input.getGenres() + "[[:>:]]'";
						//	n++;
						//}
						
						
						/*//AgeRes
						if (!(input.getAgeRestriction().equals(""))){
							attributes[n] = "Age restriction REGEXP '[[:<:]]" + input.getAgeRestriction() + "[[:>:]]'";
							n++;
						}*/
						
						String where = attributes[0];
						for (int i = 0; i<(n-1); i++){					
							where = where + " and " + attributes[i+1];
						}
					
					////////////////////////////////// 		
						System.out.println(where);
						ResultSet rs = stm.executeQuery("SELECT * FROM `TrailerPark` WHERE " + where);
						

							while (rs.next()) {
								
								byte[] image = null;
					            image = rs.getBytes("Picture");  
					            //Image img = Toolkit.getDefaultToolkit().createImage(image);
					            //ImageIcon coverPhoto = new ImageIcon(img);
								
								movieList.add(new Movie(rs.getInt("Id"), rs.getString("Title"), /*coverPhoto,*/ rs.getString("Length"), rs.getString("Language"),
										rs.getInt("Release"), rs.getString("Description of the movie"), rs.getDouble("Rate"),rs.getString("Director"),
										rs.getString("Studio"), rs.getString("Age restriction")));
								
								 nrOfMovies++;
					         
							}
							
							if (nrOfMovies == 0) {
								movieList.add(new Movie("No movies found"));
							}
				
			}

			catch (Exception ex) {
				ex.printStackTrace();
			}
	 
	 return movieList;
	 }
	
	
	 public ArrayList<Movie> getMovieList(){
		 return this.movieList;
	 }
	 
	 public int getNrOfMovies(){
		 return this.nrOfMovies;
	 }
}

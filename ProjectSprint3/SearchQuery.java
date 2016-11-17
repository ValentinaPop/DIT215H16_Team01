package DIT215H16_Team01;


import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class SearchQuery {
	private String query;
	 
	public SearchQuery (String [] input) {
		
	
		
				//////////////////////////////// inputGuery
				/* First we save all the values we get from user in array as a conditions. That way we can easily add Strings in a query.
				 * We have to add also a word 'and' between  the conditions.
				 * We save the query as a String "where" which we then add to the "Select query"
				 */
					String [] attributes = new String [9];
					int n = 0;
					
					//Title
					if (!(input[0].equals(""))){
						attributes[n] = "Title REGEXP '[[:<:]]" + input[0] + "[[:>:]]'";
						n++;
					}
					
					//Studio
					if (!(input[3].equals(""))){
						attributes[n] = "Studio REGEXP '[[:<:]]" + input[3] + "[[:>:]]'";
						n++;
					}
					
					//Language
					if (!(input[4].equals(""))){
						attributes[n] = "Language REGEXP '[[:<:]]" + input[7] + "[[:>:]]'";
						n++;
					}
				
					//Year 										////////////////////////////////how search date?
					if (!(input[1].equals(""))){
						attributes[n] = "Release REGEXP '[[:<:]]" + input[5] + "[[:>:]]'";
						n++;
					}
					
					//Director
					if (!(input[8].equals(""))){
						attributes[n] = "Director REGEXP '[[:<:]]" + input[2] + "[[:>:]]'";
						n++;
					}
					
					//Actor 
					//if (!(input[6].equals(""))){
					//	attributes[n] = "Actor REGEXP '[[:<:]]" + input[1] + "[[:>:]]'";
					//	n++;
					//}
					
					//Rating
					if (!(input[5].equals(""))){
						attributes[n] = "Rate REGEXP '[[:<:]]" + input[8] + "[[:>:]]'";
						n++;
					}
					
					//Length
					if (!(input[9].equals(""))){
						attributes[n] = "Length REGEXP '[[:<:]]" + input[9] + "[[:>:]]'";
						n++;	
					}
					
					//Genre
					//if (!(input[2].equals(""))){
					//	attributes[n] = "Genre REGEXP '[[:<:]]" + input[4] + "[[:>:]]'";
					//	n++;
					//}
					
					
					//AgeRes
					if (!(input[7].equals(""))){
						attributes[n] = "Age restriction REGEXP '[[:<:]]" + input[6] + "[[:>:]]'";
						n++;
					}
					
					String where = attributes[0];
					for (int i = 0; i<(n-1); i++){					
						where = where + " and " + attributes[i+1];
					}
				
				////////////////////////////////// 		
					query = "SELECT * FROM `TrailerPark` WHERE " + where;
					
					
	 }
	
	public String getQuery() {
		return this.query;
	}
}
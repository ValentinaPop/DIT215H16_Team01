package connection;
import java.awt.Image;
import java.sql.Date;

import javax.swing.ImageIcon;

public class Movie {
	private int id;
	private String title;
	private ImageIcon coverPhoto;
	private String runtime;
	private String language;
	private Date releaseDate;
	private String description;
	private double averageRate;
	private String director;
	private String studio;
	private String ageRestriction;
	//private Comment[] comments;
	//private Actor[] actors;
	//private Genre[] genres;
		
		
		//Default constructor
		public Movie(){
			this.id = 0;
			this.title = "";
			//this.coverPhoto = coverPhoto;
			this.runtime = "";
			this.language = "";
			//this.releaseDate;
			this.description = "";
			this.averageRate = 0;
			this.director = "";
			this.studio = "";
			this.ageRestriction = "";
		}
		
		//Constructor with title for "No movies found"
		public Movie(String title){
			this.title = title;
			//this.coverPhoto = coverPhoto;
			this.runtime = "";
			this.language = language;
			//this.releaseDate;
			this.description = "";
			this.averageRate = 0;
			this.director = "";
			this.studio = "";
			this.ageRestriction = "";
		}

		public Movie(int id, String title, ImageIcon coverPhoto, String runtime, String language, Date releseDate,
				String description, double averageRate, String director, String studio, String ageRestriction){
			this.id = id;
			this.title = title;
			this.coverPhoto = coverPhoto;
			this.runtime = runtime;
			this.language = language;
			this.releaseDate = releaseDate;
			this.description = description;
			this.averageRate = averageRate;
			this.director = director;
			this.studio = studio;
			this.ageRestriction = ageRestriction;
		}
		public int getId(){
			return id;
		}
		public String getTitle(){
			return title;
		}
		
		//public ImageIcon getCoverPhoto(){
		//	return this.coverPhoto;
		//}
		
		/*public ImageIcon getcoverPhoto(){
			return coverPhoto;
		}*/
		public String getRuntime(){
			return runtime;
		}
		public String getLanguage(){
			return language;
		}
		public int getYear(){
			int year = Integer.parseInt(("" + releaseDate).substring(0, 4));
			return year;
		}
		public String getDescription(){
			return description;
		}
		public double getAverageRate(){
			return averageRate;
		}
		public String getDirector(){
			return director;
		}
		public String getStudio(){
			return studio;
		}
		public String getAgeRestriction(){
			return ageRestriction;
		}
		public String toString(){
			return title    /* Rate: + averageRate + "\nRuntime:" + runtime*/;
		}
		public void resizeImage(int width, int height){
			
			Image image = this.coverPhoto.getImage();
			Image image2 = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			this.coverPhoto = new ImageIcon(image2);

		}
		//public Comment[] getComments(){
		//	return this.comments;
		//}
		//public Actor[] getActors(){
		//	return this.actors;
		//}
		//public Genre[] getGenres(){
		//	return this.genres;
		//}
	}
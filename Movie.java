package connection;
import java.awt.Image;
import java.sql.Date;

import javax.swing.ImageIcon;

public class Movie {
	private int id;
	private String title;
	//private String year;
	//private ImageIcon coverPhoto;
	private String runtime;
	private String language;
	private int year;
	private String description;
	private double averageRate;
	private String director;
	private String studio;
	private String ageRestriction;
	//private Comment[] comments;
	//private Actor[] actors;
	//private Genre[] genres;
	
	
	//Default constructer
	public Movie(){
		this.id = 0;
		this.title = "";
		//this.coverPhoto = coverPhoto;
		this.runtime = "";
		this.language = "";
		this.year = 0;
		this.description = "";
		this.averageRate = 0;
		this.director = "";
		this.studio = "";
		this.ageRestriction = "";
	}
	
	//Constructer with title for "No mocies found"
	public Movie(String title){
		this.title = title;
		//this.coverPhoto = coverPhoto;
		this.runtime = "";
		this.language = language;
		this.year = 0;
		this.description = "";
		this.averageRate = 0;
		this.director = "";
		this.studio = "";
		this.ageRestriction = "";
	}

	public Movie(int id, String title, /*ImageIcon coverPhoto,*/ String runtime, String language, int year, 
			String description, double averageRate, String director, String studio, String ageRestriction){
		this.id = id;
		this.title = title;
		//this.coverPhoto = coverPhoto;
		this.runtime = runtime;
		this.language = language;
		this.year = year;
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
	/*public void resizeImage(){
		coverPhoto.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
	}*/
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

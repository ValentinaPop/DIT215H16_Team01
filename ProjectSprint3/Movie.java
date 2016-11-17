package DIT215H16_Team01;
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

	public Movie(int id, String title, ImageIcon coverPhoto, String runtime, String language, Date releaseDate, 
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
	public ImageIcon getCoverPhoto(){
		return this.coverPhoto;
	}
	public int getYear(){
		int year = Integer.parseInt(("" + releaseDate).substring(0, 4));
		return year;
	}

	public String getRuntime(){
		return runtime;
	}
	public String getLanguage(){
		return language;
	}
	public Date getReleaseDate(){
		return releaseDate;
	}
	public String getDescription(){
		return description;
	}
	public String getAverageRate(){
		if (averageRate == 0){
			return "No votes";
		}
		return "" + averageRate;
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
		return title  /* +" (" + this.getYear() + ") Rate: " + averageRate + "\nRuntime:" + runtime*/;
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

package DIT215H16_Team01;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args){
		// DATABASE CONNECTION
		 String title = "momo";
		AltDBConnection movies = new AltDBConnection("Select * from `Users`", "User");
		/*ArrayList<Object> movieList = movies.getResultList();
		System.out.println((movieList.size()==0));
		for(int i=0; i< movieList.size(); i++){
			Movie movie = (Movie)movieList.get(i);
			System.out.println(movie.getTitle());
		}*/
		System.out.println(movies.getResult() == null);

	}

}

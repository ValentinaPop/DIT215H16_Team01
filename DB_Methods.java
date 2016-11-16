package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class DB_Methods {

	// connection with DB for inputing Data
	// the returned value determine if the insertion was successful

	public static int insertMovie(String title, String length, String director, String studio, String release,
			String language, String age, String description,
			// String basedOn,
			String filename) {

		// update SQL/ Inserting new movies
		String updateSQL = "INSERT INTO `TrailerPark` "
				+ "(`Title`, `Length`, `Director`, `Studio`, `Release`, `Language`, `Age restriction`, `Description of the movie`, `Picture`) "
				// Comment, Rate, Trailer
				+ "values (?, ? ,?,? ,? ,? ,? ,? ,? )";

		try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01",
				"team_01", "yOZGjlGknjwdiG4B");

				PreparedStatement pstmt = conn.prepareStatement(updateSQL,Statement.RETURN_GENERATED_KEYS)) {

			// read the file for the photo
			FileInputStream input = null;
			if (filename != null) {
				File file = new File(filename);
				input = new FileInputStream(file);
				System.out.println("Reading file " + file.getAbsolutePath());
			} else {

			}

			// reading the date
			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date t = null;
			try {
				t = ft.parse(release);

			} catch (ParseException e) {
				System.out.println("Unparseable using " + ft);
			}

			// set parameters for SQL
			pstmt.setString(1, title);
			pstmt.setString(2, length);
			pstmt.setString(3, director);
			pstmt.setString(4, studio);
			// if date changed in DB into String can be written in here
			// pstmt.setString(5, release);
			pstmt.setDate(5, new Date(t.getTime()));
			pstmt.setString(6, language);
			pstmt.setString(7, age);
			pstmt.setString(8, description);
			// pstmt.setString(9, basedOn);
			pstmt.setBinaryStream(9, input);

			// store the resume file in database
			System.out.println("Store file in the database.");
			pstmt.executeUpdate();
			
			int inserted_id=0;
			// inserted id = to connect it with actor and genre
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next())
			inserted_id = rs.getInt(1);

			return inserted_id;
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return 0;
	}

	// making sure the actor is existed in DB so get id

	public static int actorExist(String actor) {
		String updateSQL = "SELECT `Actor_Id` from `Actors_Main` where `Names`=?";

		try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01",
				"team_01", "yOZGjlGknjwdiG4B");

				PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
			pstmt.setString(1, actor);

			// get the id if the actor exists
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(actor+" allready exist");
				return rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	// inserting the actors into DB
	public static int insertActor(String actor) {
		// update SQL/ Inserting new movies
		String updateSQL = "INSERT INTO `Actors_Main` " + "(`Names`)" + "values (?)";

		try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01",
				"team_01", "yOZGjlGknjwdiG4B");

				PreparedStatement pstmt = conn.prepareStatement(updateSQL,Statement.RETURN_GENERATED_KEYS)) {

			// set parameters for SQL
			pstmt.setString(1, actor);

			pstmt.executeUpdate();
			System.out.println(actor+" is new and inserted");
			// inserted id = to connect it with actor and genre
			int inserted_id=0;
			// inserted id = to connect it with actor and genre
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next())
			inserted_id = rs.getInt(1);

			return inserted_id;
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return 0;
	}

	// implement the Ids in Relation_ActorId_Id
	public static boolean insertActorRelation(int movieId, int actorId) {
		// update SQL/ Inserting new movies
		String updateSQL = "INSERT INTO `Relation_ActorId_Id` " + "(`Id`,`Actor_Id`)" + "values (?,?)";

		try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01",
				"team_01", "yOZGjlGknjwdiG4B");

				PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

			// set parameters for SQL
			pstmt.setInt(1, movieId);
			pstmt.setInt(2, actorId);

			pstmt.executeUpdate();

			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return false;
	}

	public static int checkInsertActor(String actor) {
		int actor_id = actorExist(actor);
		if (actor_id == 0) {
			actor_id = insertActor(actor);
		}
		return actor_id;
	}

	// get genre id
	public static int insertGenre(String genre) {
		String updateSQL = "SELECT `Genre_Id` from `Genre_Main` where `Genre`=?";

		try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01",
				"team_01", "yOZGjlGknjwdiG4B");

				PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
			pstmt.setString(1, genre);

			// get the id if the actor exists
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	// set id connection in table movie/ genre
	public static boolean insertGenreRelation(int movieId, int genreId) {
		String updateSQL = "INSERT INTO `Relation_GenreId_Id` " + "(`Id`,`Genre_Id`)" + "values (?,?)";

		try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://leia.skip.chalmers.se:3306/team_01",
				"team_01", "yOZGjlGknjwdiG4B");

				PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

			// set parameters for SQL
			pstmt.setInt(1, movieId);
			pstmt.setInt(2, genreId);

			pstmt.executeUpdate();

			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return false;

	}
}
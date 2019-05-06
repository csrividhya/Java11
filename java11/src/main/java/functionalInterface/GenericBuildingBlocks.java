package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate<T> has test() function and T - type of argument. 
 * Predicates can be passed in to function(s) too. 
 * It has and(), or(), negate(), test() functions.. 
 * */

class Artist{
	String name;
	String gender;
	String albumName;
	int bbmaAwardsWon;

	public Artist(String name, String gender, String albumName, int bbmaAwardsWon) {
		this.name = name;
		this.gender=gender;
		this.albumName = albumName;
		this.bbmaAwardsWon = bbmaAwardsWon;
	}
}

public class GenericBuildingBlocks {
	public static void predicate() {
		//Find artists who have won less than 5 BBMA awards
		Artist taytay = new Artist("Taylor Swift", "female","Reputation",3);
		Artist kanye = new Artist("Kanye West","male","Graduation",2);
		Artist bee = new Artist("Beyonce Knowles","female","Ape sh*t", 10);
		List<Artist> artists = Arrays.asList(taytay,kanye,bee);
		
		//Using test() of predicate
		//Predicate<Artist> LessThan5 = artist -> artist.bbmaAwardsWon < 5? true: false;
		//Or
		Predicate<Artist> LessThan5 = artist -> artist.bbmaAwardsWon < 5;
		for(Artist a : artists) {
			if(LessThan5.test(a)) {
				System.out.println("\n Artist(s) who have won less than  BBMAs - "+a.name);
			}
		}
		
		//Predicate chaining with and()
		Predicate<Artist> femaleArtist = artist -> "female".equals(artist.gender);
		for(Artist a:artists) {
			if(LessThan5.and(femaleArtist).test(a)) {
				System.out.println("\n Female artist with less than 5 BBMAs is "+a.name);
			}
		}
		
		//Predicate or:
		for(Artist a:artists) {
			if(LessThan5.or(femaleArtist).test(a)) {
				System.out.println("\n Artist with less than 5 BBMAs or female artist is "+a.name);
			}
		}
	}
	
	public static void main(String...strings) {
		predicate();
	}
}

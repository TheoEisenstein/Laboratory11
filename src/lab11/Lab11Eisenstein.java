package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab11Eisenstein {

	public static void main(String[] args) {
		
	boolean run = true;	
	while (run) {
		
		Movie title = new Movie();
		Movie category = new Movie();
		
		List<Movie> movies = new ArrayList<>();
		
		//sci fi
		
		movies.add(new Movie("Star Wars", "Sci-fi"));
		movies.add(new Movie("The Matrix", "Sci-fi"));
		movies.add(new Movie("The Matrix Reloaded", "Sci-fi"));
		
		//Animated
		movies.add(new Movie("Frozen", "Animated"));
		movies.add(new Movie("Spirited Away", "Animated"));
		movies.add(new Movie("The Lego Movie", "Animated"));
		
		//Drama?
		
		movies.add(new Movie("Pee Wee Herman's Big Adventure", "Drama"));
		movies.add(new Movie("Fight Club", "Drama"));
		
		//Horror
		
		movies.add(new Movie("The Thing", "Horror"));
		movies.add(new Movie("The Fog", "Horror"));
		
		
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Select a category to view movies available in that category\nSci-Fi, Animated, Drama, or Horror");
		String input = scnr.nextLine();
		input.toLowerCase();
		
		//I tried for a while to make a loop, but in my public String toString() I am only returning titles...
		//So I'm not quite certain how to access the category part I created.
		
		if( input.startsWith("s")) {
			System.out.println(movies.get(0));
			System.out.println(movies.get(1));
			System.out.println(movies.get(2));
			
		}else if(input.startsWith("a")) {
			
			System.out.println(movies.get(3));
			System.out.println(movies.get(4));
			System.out.println(movies.get(5));
			
		}else if(input.startsWith("d")) {
			
			System.out.println(movies.get(6));
			System.out.println(movies.get(7));
			
		}else if(input.startsWith("h")) {
			
			System.out.println(movies.get(8));
			System.out.println(movies.get(9));
			
		}
		
		System.out.println("\nWould you like to view more movies? y/n");
		String getUserChoice1 = scnr.next();
		if (getUserChoice1.equals("n"))
			run = false;
}
	}
}


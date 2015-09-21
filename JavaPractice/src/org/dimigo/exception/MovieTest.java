/**
 * 
 */
package org.dimigo.exception;

/**
	JavaPractice 
	-org.dimigo.exception 
	--MovieTest.java
	@date : 2015. 9. 21.
	@author : 이승현
	@version : 1.0
 */
public class MovieTest extends Exception {
	public static void main(String[] args) {
		try {
			Movie[] movies = {
				new Movie("앤드맨", 12), new Movie("사도", 12), new Movie("베테랑", 15)	
			};
			int age=13;
			for(Movie movie : movies) {
				buyTicket(movie, age);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void buyTicket(Movie movie, int age) throws AgeCheckException {
		if(age < movie.getLimitAge()) {
			throw new AgeCheckException(movie);
		}
		else {
			System.out.println(movie.getTitle() + "영화 즐감하세용~~");
		}
	}
}

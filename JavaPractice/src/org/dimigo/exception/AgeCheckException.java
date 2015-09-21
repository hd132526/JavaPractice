/**
 * 
 */
package org.dimigo.exception;

/**
	JavaPractice 
	-org.dimigo.exception 
	--AgeCheckException.java
	@date : 2015. 9. 21.
	@author : 이승현
	@version : 1.0
 */
public class AgeCheckException extends Exception {
	AgeCheckException() {
		
	}
	AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
	}
}

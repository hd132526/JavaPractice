/**
 * 
 */
package org.dimigo.exception;

/**
	JavaPractice 
	-org.dimigo.exception 
	--Movie.java
	@date : 2015. 9. 21.
	@author : 이승현
	@version : 1.0
 */
public class Movie extends Exception {
	String title;
	int limitAge;
	
	Movie(String title, int age) {
		this.title = title;
		this.limitAge = age;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}
}

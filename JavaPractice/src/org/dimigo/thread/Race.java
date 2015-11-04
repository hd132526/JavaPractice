/**
 * 
 */
package org.dimigo.thread;

/**
	JavaPractice 
	-org.dimigo.thread 
	--Race.java
	@date : 2015. 11. 4.
	@author : 이승현
	@version : 1.0
 */
public class Race {
	public static void main(String[] args) {
		System.out.println("main thread start");
		Thread racer1 = new Runner("홍길동");
		Thread racer2 = new Runner("홍길순");
		
		racer1.start();
		racer2.start();
		
		System.out.println("main thread end");
		
	}
}

/**
 * 
 */
package org.dimigo.thread;

/**
	JavaPractice 
	-org.dimigo.thread 
	--Race2.java
	@date : 2015. 11. 4.
	@author : 이승현
	@version : 1.0
 */
public class Race2 {
	public static void main(String[] args) {
		System.out.println("main thread start");
		Thread racer1 = new Thread(new Runner2("홍길동"));
		Thread racer2 = new Thread(new Runner2("홍길순"));
		
		racer1.start();
		racer2.start();
		
		System.out.println("main thread end");
		
	}
}

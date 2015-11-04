/**
 * 
 */
package org.dimigo.thread;

/**
	JavaPractice 
	-org.dimigo.thread 
	--Runner2.java
	@date : 2015. 11. 4.
	@author : 이승현
	@version : 1.0
 */
public class Runner2 implements Runnable {
	String name;
	Runner2() {
	}
	
	Runner2(String name) {
		this.name = name;
	}
	
	public void run() { 
		System.out.println(name + " 출발");
		for(int i=100; i>=0; i=i-10) {
			try {
				Thread.sleep(1000);
				System.out.println(name + " " + i + " 미터");
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}
}

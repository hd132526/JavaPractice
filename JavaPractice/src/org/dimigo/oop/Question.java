/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;

/**
	JavaPractice 
	-org.dimigo.oop 
	--Question.java
	@date : 2015. 5. 11.
	@author : 이승현
	@version : 1.0
 */
public class Question {
	public static void main(String args[]) {
		
		System.out.println("가장 좋아하는 가수는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if("빅뱅".equals(answer))
			System.out.println("정답입니다! ^^");
		else
			System.out.println("틀렸습니다!! TT");
		scanner.close();
		
		System.out.println("가장 좋아하는 배우는?");
		Scanner scanner2 = new Scanner(System.in);
		String answer2 = scanner2.nextLine();
		if("문채원".equals(answer2))
			System.out.println("정답입니다! ^^");
		else
			System.out.println("틀렸습니다!! TT");
		scanner2.close();
		
		System.out.println("가장 좋아하는 과목은?");
		Scanner scanner3 = new Scanner(System.in);
		String answer3 = scanner3.nextLine();
		if("자바".equals(answer3))
			System.out.println("정답입니다! ^^");
		else
			System.out.println("틀렸습니다!! TT");
		scanner3.close();
		
		return;
	}
}

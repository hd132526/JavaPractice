/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
	JavaPractice 
	-org.dimigo.oop 
	--StringBuilder.java
	@date : 2015. 5. 14.
	@author : 이승현
	@version : 1.0
 */
public class Score {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");	
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 : ");
		int math = scanner.nextInt();
		
		System.out.println("영어 점수 입력 : ");
		int eng = scanner.nextInt();
		
		scanner.close();
		
		sb.append("<<점수 출력>>");
		sb.append("국어 점수 : " + kor + "점\n");
		sb.append("수학 점수 : " + math + "점\n");
		sb.append("영어 점수 : " + eng + "점\n");
		sb.append("총점 : " + (kor + math + eng) + "점\n");
		sb.append("평균 : " + String.format("%.1f", (kor + math + eng)/3.0) + "점\n");
		
		System.out.println(sb);
	}
}

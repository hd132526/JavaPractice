package org.dimigo.basic;

public class Operator {
	public static void main(String [] args) {
		int sa = 9;
		int sb = 10;
		double sh = 5.8;
		
		int ra = 9;
		double rb = 5.4;
		
		double ssum = (sa + sb) * sh / 2;
		double rsum = ra * rb;
		
		System.out.println("<<도형 넓이 비교>>\n");
		System.out.println("사다리꼴 넓이 : " + ssum + "\n");
		System.out.println("평행사변형 넓이 : " + rsum + "\n");
		
		if(ssum > rsum) {
			System.out.printf("사다리꼴이 평행사변형 넓이보다 %.1f 더 큽니다.\n", ssum-rsum);
		}
		if(rsum > ssum) {
			System.out.printf("평행사변형이 사다리꼴 넓이보다 %.1f 더 큽니다.\n", rsum-ssum);
		}
		if(rsum == ssum) {
			System.out.println("평행사변형과 사다리꼴의 넓이는 같습니다.\n");
		}
	}
}

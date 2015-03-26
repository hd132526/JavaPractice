package org.dimigo.basic;

public class Condition {
	public static void main(String args[])
	{
		// 경차1 / 고속버스2 / 그외3
		int bustype = 1;
		int runtime = 10;
		
		if(runtime <= 0) {
			System.out.println("0 이상의 수만 입력하세요.\n");
			return;
		}
		
		if(bustype == 1) {
			if(runtime <= 10) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 경차\n");
				System.out.println("통행료 : 300원\n");
				return;
			}
			else if(runtime > 10 && runtime <= 20) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 경차\n");
				System.out.println("통행료 : 500원\n");
				return;
			}
			else if(runtime > 20 && runtime <= 30) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 경차\n");
				System.out.println("통행료 : 700원\n");
				return;
			}
		}
		if(bustype == 2) {
			if(runtime <= 10) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 고속버스\n");
				System.out.println("통행료 : 850원\n");
				return;
			}
			else if(runtime > 10 && runtime <= 20) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 고속버스\n");
				System.out.println("통행료 : 1150원\n");
				return;
			}
			else if(runtime > 20 && runtime <= 30) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 고속버스\n");
				System.out.println("통행료 : 1450원\n");
				return;
			}
		}
		if(bustype == 3) {
			if(runtime <= 10) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 그 외\n");
				System.out.println("통행료 : 600원\n");
				return;
			}
			else if(runtime > 10 && runtime <= 20) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 그 외\n");
				System.out.println("통행료 : 800원\n");
				return;
			}
			else if(runtime > 20 && runtime <= 30) {
				System.out.println("<<고속도로 통행료 계산>>\n");
				System.out.printf("차종 : 그 외\n");
				System.out.println("통행료 : 1000원\n");
				return;
			}
		}
		else {
			System.out.println("해당되는 정보가 존재하지 않습니다.\n");
			return;
		}
	}
}

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
		
		System.out.println("<<���� ���� ��>>\n");
		System.out.println("��ٸ��� ���� : " + ssum + "\n");
		System.out.println("����纯�� ���� : " + rsum + "\n");
		
		if(ssum > rsum) {
			System.out.printf("��ٸ����� ����纯�� ���̺��� %.1f �� Ů�ϴ�.\n", ssum-rsum);
		}
		if(rsum > ssum) {
			System.out.printf("����纯���� ��ٸ��� ���̺��� %.1f �� Ů�ϴ�.\n", rsum-ssum);
		}
		if(rsum == ssum) {
			System.out.println("����纯���� ��ٸ����� ���̴� �����ϴ�.\n");
		}
	}
}

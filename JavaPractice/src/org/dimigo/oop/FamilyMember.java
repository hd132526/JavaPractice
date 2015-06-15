/**
 * 
 */
package org.dimigo.oop;

/**
	JavaPractice 
	-org.dimigo.oop 
	--FamilyMember.java
	@date : 2015. 6. 12.
	@author : 이승현
	@version : 1.0
 */
public class FamilyMember {
	private static int memberCnt=0;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
	
}

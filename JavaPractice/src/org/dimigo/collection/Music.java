/**
 * 
 */
package org.dimigo.collection;

/**
	JavaPractice 
	-org.dimigo.collection 
	--Music.java
	@date : 2015. 9. 23.
	@author : 이승현
	@version : 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
}

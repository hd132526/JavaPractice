/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
	JavaPractice 
	-org.dimigo.io 
	--SaveImageFromUrl.java
	@date : 2015. 10. 26.
	@author : 이승현
	@version : 1.0
 */
public class SaveImageFromUrl {
	public static void main(String[] args) {
		String imageUrl = "http://cfile27.uf.tistory.com/image/277D4C4D5629036E2623B6";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/iu.png")) {
				
				int result;

				while((result = is.read()) != 1) {
					os.write(result);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

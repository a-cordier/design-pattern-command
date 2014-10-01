package com.acordier.pattern;

import java.io.IOException;
import java.io.InputStream;

public class StringUtil {
	
	/** Get String from inputString using a buffer passed as an argument */
	public static String getString(InputStream inputStream, byte[] buffer) throws IOException{
		StringBuilder stringBuilder = new StringBuilder();
		while((inputStream.read(buffer)) > 0){
			stringBuilder.append(new String(buffer));
		}
		return stringBuilder.toString().trim();
	}
	
	/** Get String from inputString using a sized buffer */
	public static String getString(InputStream inputStream, int bufferSize) throws IOException{
		return getString(inputStream, new byte[bufferSize]);
	}
	
	/** Get String from inputString using a default 1024 sized buffer */
	public static String getString(InputStream inputStream) throws IOException{
		return getString(inputStream, 1024);
	}
}

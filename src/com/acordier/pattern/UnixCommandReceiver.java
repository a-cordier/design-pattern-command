package com.acordier.pattern;

import java.io.IOException;

/**
 * Command receiver for Unix like operating systems
 */
public class UnixCommandReceiver implements CommandReceiver {

	@Override
	public void printNetworkConfiguration() {
		Process process;
		try {
			process = Runtime.getRuntime().exec("ifconfig");
			System.out.println(StringUtil.getString(process.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
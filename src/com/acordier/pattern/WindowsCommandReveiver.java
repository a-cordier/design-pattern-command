package com.acordier.pattern;

import java.io.IOException;

/**
 * Command receiver for Microsoft Windows operating systems
 */
public class WindowsCommandReveiver implements CommandReceiver {

	@Override
	public void printNetworkConfiguration() {
		Process process;
		try {
			process = Runtime.getRuntime().exec("ipconfig");
			System.out.println(StringUtil.getString(process.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

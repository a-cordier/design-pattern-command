package com.acordier.pattern;

/**
 * Client application is responsible for assigning a suitable receiver
 *
 */
public class CommandApp {

	public static void main(String[] args) {
		PrintNetworkConfigurationCommand networkCommand = new PrintNetworkConfigurationCommand();
		
		/* Designate a suitable receiver */
		if(System.getProperty("os.name").contains("Windows")){
			networkCommand.setReceiver(new WindowsCommandReveiver());
		}
		else{
			networkCommand.setReceiver(new UnixCommandReceiver());
		}
		/* Request for command execution */
		networkCommand.execute();
	}

}

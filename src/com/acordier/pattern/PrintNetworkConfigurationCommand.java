package com.acordier.pattern;

public class PrintNetworkConfigurationCommand implements Command{
	
	CommandReceiver receiver;
	
	public void setReceiver(CommandReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.printNetworkConfiguration();	
	}

}

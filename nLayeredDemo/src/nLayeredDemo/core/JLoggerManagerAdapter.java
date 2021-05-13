package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		
		//logger kodu Jlogger kodundan gelicek;
		JLoggerManager manager = new JLoggerManager();
		
		manager.log(message);
	}

}

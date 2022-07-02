public class LogLevels {  
  public static String message(String logLine) {
		String message = "";
		for (int i = 0; i < logLine.length(); ++i ) {
			message += logLine.substring(i);
		}
		return message;
  }
  
	public static String logLevel(String logLine) {
      throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
  }

  public static String reformat(String logLine) {
      throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
  }
}

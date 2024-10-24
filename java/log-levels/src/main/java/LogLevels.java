public class LogLevels {  
  public static String message(String logLine) {
	  return logLine.substring(logLine.indexOf(":") + 1, logLine.length()).trim();	
  }
  
	public static String logLevel(String logLine) {
    return logLine.substring(1, logLine.indexOf("]")).toLowerCase();
  }

  public static String reformat(String logLine) {
    return message(logLine).concat(" (" + logLevel(logLine) + ")"); 
  }
}

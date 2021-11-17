package Patterns.Singleton;

public class ProgrammerLogger {
    private static ProgrammerLogger programmerLogger;
    private static String logFile = "See on log file.\n\n";

    public static synchronized ProgrammerLogger getProgrammerLogger(){
        if(programmerLogger == null){
            programmerLogger = new ProgrammerLogger();
        }
        return programmerLogger;
    }

    private ProgrammerLogger(){
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo +"\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}

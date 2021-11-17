package Patterns.Singleton;

// https://www.youtube.com/watch?v=vyr9GO7dLBQ

public class ProgrammRunner {
    public static void main(String[] args) {
        ProgrammerLogger.getProgrammerLogger().addLogInfo("Esimene log");
        ProgrammerLogger.getProgrammerLogger().addLogInfo("Teine log");
        ProgrammerLogger.getProgrammerLogger().addLogInfo("Kolmas log");

        ProgrammerLogger.getProgrammerLogger().showLogFile();
    }
}

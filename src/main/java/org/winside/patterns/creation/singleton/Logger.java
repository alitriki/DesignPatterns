package org.winside.patterns.creation.singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent direct instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        // Logging implementation
        System.out.println("[Logger] " + message);
    }
}


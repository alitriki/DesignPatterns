package org.winside.patterns.creation.singleton;

public class ThreadRunner {

    public static void main(String[] args) {
        int numThreads = 5;
        Logger logger = Logger.getInstance();

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new WorkerThread(logger));
            thread.start();
        }
    }

    public static class WorkerThread implements Runnable {
        private Logger logger;

        public WorkerThread(Logger logger) {
            this.logger = logger;
        }

        @Override
        public void run() {
            Logger threadLogger = Logger.getInstance();
            if (threadLogger == logger) {
                System.out.println("Same Logger instance");
            } else {
                System.out.println("Different Logger instance");
            }

            // Perform some work...
        }
    }
}


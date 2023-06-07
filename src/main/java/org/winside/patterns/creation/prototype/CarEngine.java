package org.winside.patterns.creation.prototype;

public class CarEngine {
    public CarEngine() {
        wormUpCarEngine();
    }
    private void wormUpCarEngine() {
        // Simulate a costly operation during object creation
        try {
            Thread.sleep(2000);
            System.out.println("Sleep for 2 seconds to simulate the overhead");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

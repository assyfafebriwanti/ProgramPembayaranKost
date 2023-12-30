/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayarankost;

/**
 *
 * @author OnO
 */
public class Utilities {
    private double currentReading;
    private double lastReading;
    private double totalUsage;

    public Utilities(double currentReading, double lastReading) {
        this.currentReading = currentReading;
        this.lastReading = lastReading;
        this.totalUsage = currentReading - lastReading;
    }

    // Getter and Setter
    public double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }

    public double getLastReading() {
        return lastReading;
    }

    public void setLastReading(double lastReading) {
        this.lastReading = lastReading;
    }

    public double getTotalUsage() {
        return totalUsage;
    }
}


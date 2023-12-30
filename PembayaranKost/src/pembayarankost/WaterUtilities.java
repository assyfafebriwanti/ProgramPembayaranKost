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
public class WaterUtilities extends Utilities implements CostCalculator {
    public WaterUtilities(double currentReading, double lastReading) {
        super(currentReading, lastReading);
    }

    // Implementasi dari interface CostCalculator
    @Override
    public double calculateCost(double usage) {

        double rate = 5.0; 
        return usage * rate;
    }
}

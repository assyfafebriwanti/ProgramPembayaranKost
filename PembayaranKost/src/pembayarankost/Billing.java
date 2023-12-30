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
public class Billing {
    private double waterBill;
    private double electricityBill;
    private double roomCost = 500000.0;

    public void calculateBills(WaterUtilities waterUtilities, ElectricityUtilities electricityUtilities) {
        // Menggunakan interface untuk menghitung biaya
        waterBill = waterUtilities.calculateCost(waterUtilities.getTotalUsage());
        electricityBill = electricityUtilities.calculateCost(electricityUtilities.getTotalUsage());
    }

    public double getTotalPayment() {
        // Menghitung total pembayaran
        return waterBill + electricityBill + roomCost;
    }
}


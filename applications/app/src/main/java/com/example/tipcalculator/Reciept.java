package com.example.tipcalculator;

import java.io.Serializable;

public class Reciept implements Serializable {
    private double amount;
    private double tax_Per;
    private double tip_Per;

    public Reciept(double amount, double tax_per, double tip_per) {
        this.amount = amount;
        this.tax_Per = tax_per;
        this.tip_Per = tip_per;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax_Per() {
        return tax_Per;
    }

    public void setTax_Per(double tax_Per) {
        this.tax_Per = tax_Per;
    }

    public double getTip_Per() {
        return tip_Per;
    }

    public void setTip_Per(double tip_Per) {
        this.tip_Per = tip_Per;
    }
}

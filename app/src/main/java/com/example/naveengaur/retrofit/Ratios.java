package com.example.naveengaur.retrofit;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by naveengaur on 27/4/18.
 */

public class Ratios {
    private double currentRatio;



    private double QuickRatio;
    private double cashRatio;
    private double debtToEquityRatio;
    private double longTermDebtToEquityRatio;
    public Ratios()
    {

    }

    public Ratios(double currentRatio, double quickRatio, double cashRatio, double debtToEquityRatio, double longTermDebtToEquityRatio) {
        super();
        this.currentRatio = currentRatio;
        QuickRatio = quickRatio;
        this.cashRatio = cashRatio;
        this.debtToEquityRatio = debtToEquityRatio;
        this.longTermDebtToEquityRatio = longTermDebtToEquityRatio;
    }
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();



    public double getCurrentRatio() {
        return currentRatio;
    }

    public Double getCashRatio() {
        return cashRatio;
    }

    public Double getDebtToEquityRatio() {
        return debtToEquityRatio;
    }

    public Double getLongTermDebtToEquityRatio() {
        return longTermDebtToEquityRatio;
    }
/*
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
*/
    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public void setCashRatio(Double cashRatio) {
        this.cashRatio = cashRatio;
    }

    public void setDebtToEquityRatio(Double debtToEquityRatio) {
        this.debtToEquityRatio = debtToEquityRatio;
    }

    public void setLongTermDebtToEquityRatio(Double longTermDebtToEquityRatio) {
        this.longTermDebtToEquityRatio = longTermDebtToEquityRatio;
    }
/*
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
*/
    public double getQuickRatio() {
        return QuickRatio;
    }

    public void setQuickRatio(double quickRatio) {
        QuickRatio = quickRatio;
    }


}

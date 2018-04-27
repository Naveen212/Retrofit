package com.example.naveengaur.retrofit;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by naveengaur on 27/4/18.
 */

public class XbrlElements {
    private BigDecimal inventoryNet;
    private BigDecimal assetsCurrent;
    private BigDecimal cashAndCashEquivalentsAtCarryingValue;
    private BigDecimal assets;
    private BigDecimal liabilities;
    private BigDecimal liabilitiesCurrent;
    private BigDecimal liabilitiesAndStockholdersEquity;

    public XbrlElements(BigDecimal inventoryNet, BigDecimal assetsCurrent, BigDecimal cashAndCashEquivalentsAtCarryingValue, BigDecimal assets, BigDecimal liabilities, BigDecimal liabilitiesCurrent, BigDecimal liabilitiesAndStockholdersEquity) {
        this.inventoryNet = inventoryNet;
        this.assetsCurrent = assetsCurrent;
        this.cashAndCashEquivalentsAtCarryingValue = cashAndCashEquivalentsAtCarryingValue;
        this.assets = assets;
        this.liabilities = liabilities;
        this.liabilitiesCurrent = liabilitiesCurrent;
        this.liabilitiesAndStockholdersEquity = liabilitiesAndStockholdersEquity;
    }
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();



    public BigDecimal getInventoryNet() {
        return inventoryNet;
    }

    public BigDecimal getAssetsCurrent() {
        return assetsCurrent;
    }

    public BigDecimal getCashAndCashEquivalentsAtCarryingValue() {
        return cashAndCashEquivalentsAtCarryingValue;
    }

    public BigDecimal getAssets() {
        return assets;
    }

    public BigDecimal getLiabilities() {
        return liabilities;
    }

    public BigDecimal getLiabilitiesCurrent() {
        return liabilitiesCurrent;
    }

    public BigDecimal getLiabilitiesAndStockholdersEquity() {
        return liabilitiesAndStockholdersEquity;
    }
/*
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
*/
    public void setInventoryNet(BigDecimal inventoryNet) {
        this.inventoryNet = inventoryNet;
    }

    public void setAssetsCurrent(BigDecimal assetsCurrent) {
        this.assetsCurrent = assetsCurrent;
    }

    public void setCashAndCashEquivalentsAtCarryingValue(BigDecimal cashAndCashEquivalentsAtCarryingValue) {
        this.cashAndCashEquivalentsAtCarryingValue = cashAndCashEquivalentsAtCarryingValue;
    }

    public void setAssets(BigDecimal assets) {
        this.assets = assets;
    }

    public void setLiabilities(BigDecimal liabilities) {
        this.liabilities = liabilities;
    }

    public void setLiabilitiesCurrent(BigDecimal liabilitiesCurrent) {
        this.liabilitiesCurrent = liabilitiesCurrent;
    }

    public void setLiabilitiesAndStockholdersEquity(BigDecimal liabilitiesAndStockholdersEquity) {
        this.liabilitiesAndStockholdersEquity = liabilitiesAndStockholdersEquity;
    }
/*
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
*/


}

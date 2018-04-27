package com.example.naveengaur.retrofit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by naveengaur on 27/4/18.
 */

public class Identifiers {
    private String ticker;
    private String name;
    private String cik;

    public Identifiers(String ticker, String name, String cik) {
        this.ticker = ticker;
        this.name = name;
        this.cik = cik;
    }


    public String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getTicker() {
        return ticker;
    }

    public String getCik() {
        return cik;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }



}

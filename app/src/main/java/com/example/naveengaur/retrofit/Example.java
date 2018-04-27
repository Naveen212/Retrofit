package com.example.naveengaur.retrofit;

import com.google.gson.annotations.Expose;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by naveengaur on 27/4/18.
 */

public class Example {
    private Integer year;
    private Identifiers identifiers;
    @Expose
    private XbrlElements xbrlElements;
    @Expose
    private Ratios ratios;
    public Example()
    {

    }

    public Example(Integer year, Identifiers identifiers, XbrlElements xbrlElements, Ratios ratios) {
        super();
        this.year = year;
        this.identifiers = identifiers;
        this.xbrlElements = xbrlElements;
        this.ratios = ratios;
    }
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();




    public Integer getYear() {
        return year;
    }

    public Identifiers getIdentifiers() {
        return identifiers;
    }

    public XbrlElements getXbrlElements() {
        return xbrlElements;
    }

    public Ratios getRatios() {
        return ratios;
    }
/*
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
*/
    public void setYear(Integer year) {
        this.year = year;
    }

    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    public void setXbrlElements(XbrlElements xbrlElements) {
        this.xbrlElements = xbrlElements;
    }

    public void setRatios(Ratios ratios) {
        this.ratios = ratios;
    }
/*
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
*/


}

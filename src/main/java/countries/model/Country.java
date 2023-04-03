package com.techelevator.countries.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Country {

    @JsonProperty("ccn3")
    private int id;
    private Name name;
    @JsonProperty("currencies")
    private Currency currency;
    @JsonProperty("languages")
    private Language language;
    private String[] capital;
    private String[] borders;
    private String region;
    private String subregion;


    @Override
    public String toString() {
        return  "\n--------------------------------------------" +
                "\n Here's some facts about " + name + "!"        +
                "\n--------------------------------------------" +
                "\n Currency (abbreviation and name): " + currency +
                "\n Language(s) Spoken: " + language +
                "\n Capital: " + Arrays.toString(capital).replaceAll("\\[|\\]", "") +
                "\n Region: " + region +
                "\n Sub-region: " + subregion +
                hasBorders(name);
    }

    public String hasBorders(Name name) {
        if (borders != null) {
            return  "\n Bordering countries: " + Arrays.toString(borders).replaceAll("\\[|\\]", "");
        } else return  "\n Bordering countries: None, you chose an island!";
    }


    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name){
        this.name = name;
    }

    public String[] getBorders() {
        return borders;
    }

    public void setBorders(String[] borders) {
        this.borders = borders;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency  currency) {
        this.currency = currency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language){
        this.language=language;
    }

    public String[] getCapital(){
        return capital;
    }

    public String getRegion(){
        return region;
    }

    public String getSubregion(){
        return subregion;
    }
}

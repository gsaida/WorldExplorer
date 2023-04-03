package com.techelevator.countries.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Name {

    private String commonName;

    @JsonGetter("name")
    public String getName(){
        return commonName;
    }

    @JsonSetter("common")
    public void setName(String commonName){
        this.commonName=commonName;
    }

    @Override
    public String toString(){
        return commonName;
    }

}

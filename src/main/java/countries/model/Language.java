package com.techelevator.countries.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Language {

    private String language;

    @JsonProperty("languages")
    private Map<String, String> languageMap = new HashMap<>();

    @JsonAnyGetter
    public Map<String, String> getLanguageMap() {
        return languageMap;
    }

    @JsonAnySetter
    public void setLanguage(String key, String value) {
        languageMap.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = languageMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            str.append(entry.getValue());
            if (it.hasNext()) {
                str.append(", ");
            }
        }
        return str.toString();
    }


    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }



}

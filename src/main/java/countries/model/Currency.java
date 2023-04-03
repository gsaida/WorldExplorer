package com.techelevator.countries.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Currency {

    private String currency;

    @JsonProperty("currencies")
    private Map<String, Map<String, String>> currencies = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Map<String, String>> getCurrenciesMap() {
        return currencies;
    }

    @JsonAnySetter
    public void setCurrencies(String key, Map<String, String> value) {
        currencies.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Iterator<Map.Entry<String, Map<String, String>>> it = currencies.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Map<String, String>> entry = it.next();
            str.append(entry.getKey()).append(", ").append(entry.getValue().get("name"));
            if (it.hasNext()) {
                str.append(", ");
            }
        }
        return str.toString();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

package com.jake;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @JsonProperty("Name")
    public String name;
    @JsonProperty("LastPrice")
    public Double lastPrice;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("Change")
    public Double change;

    public Quote() {}

    @Override
    public String toString() {
        return "Quote { Name='" + name + "', LastPrice = "+ lastPrice + ",  Change=" + change + "}";
    }

}

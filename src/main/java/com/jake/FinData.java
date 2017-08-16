package com.jake;

/**
 * Created by jvogelaar on 8/15/17.
 */
public class FinData {

    private String ticker;
    private String name;

    public String getTicker() {
        return ticker;
    }

    public FinData(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FinData{" +
                "ticker='" + ticker + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

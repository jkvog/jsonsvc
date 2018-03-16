package com.jake;

/**
 * Created on 8/15/17.
 */
public class FinData {

    //added a comment

    private String ticker;
    private String name;

    @Override
    public String toString() {
        return "FinData{" +
                "ticker='" + ticker + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public FinData(String ticker, String name) {
        this.ticker = ticker;
        this.name = name;
    }

    private Double price;

    public String getTicker() {
        return ticker;
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

}


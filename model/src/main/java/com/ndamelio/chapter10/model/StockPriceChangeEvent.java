package com.ndamelio.chapter10.model;

import java.math.BigDecimal;

public class StockPriceChangeEvent {

    private final String stockTicker;
    private final BigDecimal oldPrice;
    private final BigDecimal newPrice;

    public StockPriceChangeEvent(String stockTicker, BigDecimal oldPrice, BigDecimal newPrice) {
        this.stockTicker = stockTicker;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public String getStockTicker() {
        return stockTicker;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    @Override
    public String toString() {
        return "{\"StockPriceChangeEvent\":{"
                + "\"stockTicker\":\"" + stockTicker + "\""
                + ", \"oldPrice\":\"" + oldPrice + "\""
                + ", \"newPrice\":\"" + newPrice + "\""
                + "}}";
    }
}
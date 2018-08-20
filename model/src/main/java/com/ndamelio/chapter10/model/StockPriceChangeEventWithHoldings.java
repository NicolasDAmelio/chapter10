package com.ndamelio.chapter10.model;

import java.math.BigDecimal;

public class StockPriceChangeEventWithHoldings extends StockPriceChangeEvent {

    private Integer holdings;

    public StockPriceChangeEventWithHoldings(StockPriceChangeEvent event, Integer holdings) {
        super(event.getStockTicker(), event.getOldPrice(), event.getNewPrice());
        this.holdings = holdings;
    }

    public Integer getHoldings() {
        return holdings;
    }

    @Override
    public String toString() {
        return "{\"StockPriceChangeEventWithHoldings\":{"
                + "\"holdings\":\"" + holdings + "\""
                + "}}";
    }
}
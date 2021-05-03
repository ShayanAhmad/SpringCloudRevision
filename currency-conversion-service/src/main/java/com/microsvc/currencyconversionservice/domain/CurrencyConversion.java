package com.microsvc.currencyconversionservice.domain;

import java.math.BigDecimal;

public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal amount;
    private BigDecimal conversionMultiple;
    private BigDecimal totalValue;
    private Integer port;

    public CurrencyConversion(Long id, String from, String to, BigDecimal amount,
                              BigDecimal conversionMultiple, BigDecimal totalValue, Integer port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.conversionMultiple = conversionMultiple;
        this.totalValue = totalValue;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public Integer getPort() {
        return port;
    }
}

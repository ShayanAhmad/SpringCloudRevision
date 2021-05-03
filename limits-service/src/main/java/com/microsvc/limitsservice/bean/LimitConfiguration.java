package com.microsvc.limitsservice.bean;

public class LimitConfiguration {
    private int minimum;
    private int maximum;

    protected LimitConfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

}

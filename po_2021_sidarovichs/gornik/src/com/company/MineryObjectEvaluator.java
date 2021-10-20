package com.company;

public interface MineryObjectEvaluator {
    default double getModifiedMarketValue() {
        return 0;
    }
}

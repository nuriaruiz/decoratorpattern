package com.nuria.pattern.decorator;

import java.math.BigDecimal;

public class PlainOakDoor implements Door {
    @Override
    public String getDescription() {
        return "Door of oak wood";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(100.0);
    }
}

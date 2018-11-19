package com.nuria.pattern.decorator;

import java.math.BigDecimal;

public class BeveledDoor extends DoorDecorator {
    public BeveledDoor(Door newDoor) {
        super(newDoor);
        System.out.println("Adding beveled");
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", Beveled";
    }

    @Override
    public BigDecimal getCost() {
        return  super.getCost().add(new BigDecimal(50.0));
    }
}

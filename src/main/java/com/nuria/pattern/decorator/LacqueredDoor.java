package com.nuria.pattern.decorator;

import java.math.BigDecimal;

public class LacqueredDoor extends DoorDecorator {
    public LacqueredDoor(Door newDoor) {
        super(newDoor);
        System.out.println("Adding lacquered");
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", Lacquered";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(25.5));
    }
}

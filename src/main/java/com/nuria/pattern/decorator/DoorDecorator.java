package com.nuria.pattern.decorator;

import java.math.BigDecimal;

abstract class DoorDecorator implements Door{
    protected Door door;

    public DoorDecorator(Door newDoor){
        this.door = newDoor;
    }

    public String getDescription(){
        return door.getDescription();
    }

    public BigDecimal getCost(){
        return door.getCost();
    }
}

package com.sotiris.loizou.battleship;

import java.util.Arrays;

public class Ship {
    boolean[]shipParts;
    ConstAttributes.ShipOrientation orientation;
    public Ship(ConstAttributes.ShipType shipType,ConstAttributes.ShipOrientation orientation){
        shipParts = new boolean[shipType.size];
        Arrays.fill(shipParts,true);
        this.orientation=orientation;
    }

}

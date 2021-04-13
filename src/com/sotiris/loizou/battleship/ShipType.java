package com.sotiris.loizou.battleship;

public enum ShipType {
    BATTLESHIP(5), DESTROYER(4);
    public final int size;
    ShipType(int size){
        this.size=size;
    }
}

package com.sotiris.loizou.battleship;

public final class ConstAttributes{
    public enum ShipType {
        BATTLESHIP(5), DESTROYER(4);
        public final int size;
        ShipType(int size){
            this.size=size;
        }
    }
    public enum ShipOrientation{
        VERTICAL("VERTICAL"), HORIZONTAL("HORIZONTAL");
        public final String name;
        ShipOrientation(String name){this.name=name;};
    }
}


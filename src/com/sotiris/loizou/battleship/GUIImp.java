package com.sotiris.loizou.battleship;

import java.lang.reflect.Array;

public class GUIImp {
    private final int BOXSPACE=2;
    private final char[] charPrints={'+','-','|',' '};
    public GUIImp(){

    }
    public void printGui(int height, int length){
        int y=0;
        int x=0;
        for (int i=0;i<height;i++){
            this.printRow(length,x,y);
            y+=1;
        }
        for(int j=0; j<(length);j++){

            System.out.print(charPrints[0]);
            System.out.print(charPrints[1]);
            System.out.print(charPrints[1]);
            System.out.print(charPrints[1]);

        }
        System.out.print(charPrints[0]);
    }
    public void printRow(int length, int x , int y){
        int offset=0;
        for (int i=0; i<BOXSPACE;i++){

            for(int j=0; j<(length);j++){

                System.out.print(charPrints[0+offset]);
                System.out.print(charPrints[1+offset]);
                System.out.print(charPrints[1+offset]);
                System.out.print(charPrints[1+offset]);

            }
            x+=1;
            System.out.print(charPrints[0+offset]);
            offset=(offset+2)%4;
            System.out.println();

        }

    }
}

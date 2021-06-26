package com.github.perschola;

import java.lang.reflect.Array;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String stringMultiplicationTable=getMultiplicationTable(5);
        return stringMultiplicationTable;
    }

    public static String getLargeMultiplicationTable() {
        String stringMultiplicationTable=getMultiplicationTable(10);
        return stringMultiplicationTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String stringMultiplicationTable="";
        for(int i=1;i<=tableSize;i++){
            String line="";
            for (int j=1;j<=tableSize;j++){
                line+=String.format("%3s",i*j)+ " "+ "|";
            }
            stringMultiplicationTable+=line+"\n";
        }
        return stringMultiplicationTable;
    }
}

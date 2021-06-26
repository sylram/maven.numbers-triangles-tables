package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
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

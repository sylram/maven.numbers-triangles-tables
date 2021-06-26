package com.github.curriculeon;


public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        return new String(new char[numberOfStars]).replaceAll("\u0000", "*");
    }

    public static String getTriangle(int numberOfRows) {
        String triangle="";
        int currentRow=1;
        while (currentRow<numberOfRows  ){
            triangle+=getRow(currentRow)+"\n";
            currentRow++;
        }
        return triangle;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}

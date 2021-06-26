package com.github.perschola;


public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle="";
        int currentRaw=1;
        while (currentRaw<numberOfRows  ){
            triangle+=getRow(currentRaw)+"\n";
            currentRaw++;
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String raw = "*".repeat(numberOfStars);
        return raw;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);

    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}

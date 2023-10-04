package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i < numberOfRows ; i++) {
           triangle.append(getRow(i)).append("\n");
        }

        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < numberOfStars ; i++) {
            row.append("*");
        }
        return row.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= 4 ; i++) {
            triangle.append(getRow(i)).append("\n");
        }

        return triangle.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i < 10 ; i++) {
            triangle.append(getRow(i)).append("\n");
        }

        return triangle.toString();
    }
}

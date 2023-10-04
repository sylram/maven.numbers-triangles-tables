package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = start; i < stop ; i++) {
            if (i % 2 == 0) {
                evenNumbers.append(i);
            }
        }
        return evenNumbers.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder oddNumbers = new StringBuilder();
        for (int i = start; i < stop ; i++) {
            if (i % 2 != 0) {
                oddNumbers.append(i);
            }
        }
        return oddNumbers.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for (int i = start; i < stop ; i += step) squareNumbers += (i * i);
        return squareNumbers;
    }

    public static String getRange(int start) {
        StringBuilder range = new StringBuilder();
        for (int i = 0; i < start ; i++) {
                range.append(i);

        }
        return range.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder range = new StringBuilder();
        for (int i = start; i < stop ; i++) {
                range.append(i);
        }
        return range.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder range = new StringBuilder();
        for (int i = start; i < stop ; i+= step) {
            range.append(i);
        }
        return range.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponentiations = "";
        for (int i = start; i < stop ; i += step) {
            int result = (int) Math.pow(i,exponent);
            exponentiations += result;
        }
        return exponentiations;
    }
}

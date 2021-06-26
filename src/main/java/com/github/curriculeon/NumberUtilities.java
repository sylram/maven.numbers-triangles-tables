package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        if (start%2!=0){
            start++;
        }
        String evenNumbers=getRange(start,stop,2);
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        if (start%2!=1){
            start++;
        }
        String evenNumbers=getRange(start,stop,2);
        return evenNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String range = getExponentiations(start, stop, step, 2);
        return range;

    }

    public static String getRange(int stop) {
        String range = getRange(0, stop);
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = getRange(start, stop, 1);
        return range;

    }


    public static String getRange(int start, int stop, int step) {
        String range = getExponentiations(start, stop, step, 1);
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int    currentNumber = start;
        String range         = "";
        while ( currentNumber < stop ) {
            range += (int)Math.pow(currentNumber,exponent);
            currentNumber += step;
        }
        return range;
    }
}

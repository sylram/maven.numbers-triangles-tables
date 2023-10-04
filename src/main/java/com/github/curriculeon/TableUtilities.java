package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 5 ; i++) {
            table.append(String.format(" %2s", i)).append(" |");
            for (int j = 2; j <= 5 ; j++) {
                table.append(String.format(" %2s", i * j)).append(" |");
            }
            table.append("\n");
        }
        return table.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10 ; i++) {
            table.append(String.format(" %2s", i)).append(" |");
            for (int j = 2; j <= 10 ; j++) {
                table.append(String.format("%3s ", i * j)).append("|");
            }
            table.append("\n");
        }
        return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= tableSize ; i++) {
            table.append(String.format(" %2s", i)).append(" |");
            for (int j = 2; j <= tableSize ; j++) {
                table.append(String.format("%3s ", i * j)).append("|");
            }
            table.append("\n");
        }
        return table.toString();
    }
}

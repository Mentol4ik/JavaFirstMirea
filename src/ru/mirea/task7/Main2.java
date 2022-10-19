package ru.mirea.task7;

public class Main2 {
    public static void main(String[] args) {
        ProcessStrings ps = new ProcessStrings();
        String test = "123456 123";
        System.out.println(ps.getStringLength(test));
        System.out.println(ps.getSymbolsAtOddPos(test));
        System.out.println(ps.reverseString(test));
    }
}


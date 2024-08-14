package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int q) {
        return q / x;
    }

    public int sumAllOperation(int y, int a, int z, int q) {
        return sum(y) + multiply(a) + minus(z) + divide(q);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumres = sum(10);
        System.out.println(sumres);
        int multiplres = calculator.multiply(3);
        System.out.println(multiplres);
        int minusres = minus(8);
        System.out.println(minusres);
        int dividedres = calculator.divide(15);
        System.out.println(dividedres);
        int sumall = calculator.sumAllOperation(10, 3, 8, 15);
        System.out.println(sumall);
    }
}
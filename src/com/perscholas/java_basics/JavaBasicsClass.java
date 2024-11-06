package com.perscholas.java_basics;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaBasicsClass {
    public static void main(String[] args) {
        addIntegers();
        addDoubles();
        addIntAndDouble();
        divideIntegers();
        divideDoublesAndCast();
        addDoublesAndCast();
        constantCalculation();
        cafePrices();
    }

    public static void addIntegers() {
        int int1 = 5;
        int int2 = 10;
        int intSum = int1 + int2;
        System.out.println("Sum of integers: " + intSum);
    }

    public static void addDoubles() {
        double double1 = 5.5;
        double double2 = 10.5;
        double doubleSum = double1 + double2;
        System.out.println("Sum of doubles: " + doubleSum);
    }

    public static void addIntAndDouble() {
        int intVar = 7;
        double doubleVar = 3.5;
        double mixedSum = intVar + doubleVar;
        System.out.println("Sum of integer and double: " + mixedSum);
    }

    public static void divideIntegers() {
        int num1 = 20;
        int num2 = 4;
        int largerInt = Math.max(num1, num2);
        int smallerInt = (largerInt == num1) ? num2 : num1;
        int intDivision = largerInt / smallerInt;
        System.out.println("Integer division result: " + intDivision);

        double largerDecimal = Math.max(20.0, 4.0);
        double smallerDecimal = (largerDecimal == 20.0) ? 4.0 : 20.0;
        double decimalDivision = largerDecimal / smallerDecimal;
        System.out.println("Decimal division result: " + decimalDivision);
    }

    public static void divideDoublesAndCast() {
        double num1 = 15.5;
        double num2 = 2.5;
        double largerDouble = Math.max(num1, num2);
        double smallerDouble = (largerDouble == num1) ? num2 : num1;
        double doubleDivision = largerDouble / smallerDouble;
        System.out.println("Double division result: " + doubleDivision);

        int castedResult = (int) doubleDivision;
        System.out.println("Casted division result: " + castedResult);
    }

    public static void addDoublesAndCast() {
        int x = 5;
        int y = 6;

        int q = y / x;
        System.out.println("Result of integer division (q): " + q);

        double qDouble = (double) y / x;
        // double qDouble = (double) y; not sure which its asking for?
        System.out.println("Result after casting y to double (q): " + qDouble);
    }

    public static void constantCalculation() {
        final int NUM1 = 10;
        final int NUM2 = 20;
        System.out.println("Multiplying constant 10 by constant 20: " + NUM1 * NUM2);
    }

    public static void cafePrices() {
        double chaiLatte = 4.75;
        double hotCocoa = 3.00;
        double smCoffee = 1.50;

        double subTotal = (chaiLatte * 3) + (hotCocoa * 4) + (smCoffee * 2);

        final double SALES_TAX = 0.98;

        double totalSale = new BigDecimal(subTotal + (subTotal * SALES_TAX)).setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println("Final order total: " + totalSale);
    }
}
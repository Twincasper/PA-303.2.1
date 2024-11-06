package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {
        addIntegers();
        addDoubles();
        addIntAndDouble();
        divideIntegers();
        divideDoublesAndCast();
    }

    public static void addIntegers() {
        System.out.println("Sum of integers: " + (5 + 10));
    }

    public static void addDoubles() {
        System.out.println("Sum of doubles: " + (5.5 + 10.5));
    }

    public static void addIntAndDouble() {
        System.out.println("Sum of integer and double: " + (7 + 3.5));
    }

    public static void divideIntegers() {
        System.out.println("Integer division result: " + (20 / 4));
        System.out.println("Decimal division result: " + (20.0 / 4));
    }

    public static void divideDoublesAndCast() {
        double doubleDivision = 15.5 / 2.5;
        System.out.println("Double division result: " + doubleDivision);
        System.out.println("Casted division result: " + (int) doubleDivision);
    }
}
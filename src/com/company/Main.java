package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 42) {
                System.out.println("Answer to the question of life, the universe, and everything");
            } else if (i % 3 ==0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

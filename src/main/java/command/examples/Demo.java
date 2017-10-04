package main.java.command.examples;

/**
 * Created by Chalauri-G on 10/4/2017.
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("The sum of numbers from 1 to 100 = " + sumOfSequence(1, 100));
        System.out.println("The sum of squares  from 1 to 10 = " + sumOfSequence(1, 10));
    }


    private static int sumOfSequence(int lower, int upper) {
        int sum = 0;
        for (int number = lower; number <= upper; number++) {
            sum += number;
        }

        return sum;
    }

    private static int sumOfSquares(int lower, int upper) {
        int sum = 0;
        for (int number = lower; number <= upper; number++) {
            sum += (number * number);
        }

        return sum;
    }
}

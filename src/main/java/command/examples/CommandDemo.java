package main.java.command.examples;

/**
 * Created by Chalauri-G on 10/4/2017.
 */
public class CommandDemo {
    public static void main(String[] args) {
        System.out.println("The sum of numbers from 1 to 100 = " + sum(1, 100, new Function() {

            @Override
            public int apply(int number) {
                return number;
            }
        }));
        System.out.println("The sum of squares  from 1 to 10 = " + sum(1, 10, new Function() {
            @Override
            public int apply(int number) {
                return number * number;
            }
        }));
    }


    private static int sum(int lower, int upper, Function function) {
        int sum = 0;
        for (int number = lower; number <= upper; number++) {
            sum += function.apply(number);
        }

        return sum;
    }

}

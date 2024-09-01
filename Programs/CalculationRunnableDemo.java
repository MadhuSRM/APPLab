package com.srm;

class CalculationRunnable implements Runnable {
    private int number;

    public CalculationRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int result = computeSquare(number);
        System.out.println("Square of " + number + " is " + result);
    }

    private int computeSquare(int n) {
       return (int)Math.pow(n, 2);
    }
}

public class CalculationRunnableDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 16};

        for (int number : numbers) {
            Thread thread = new Thread(new CalculationRunnable(number));
            thread.start();
        }
    }
}

package com.lookAndleap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("I have the mo0ootivation...");
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i = 0; i < array.length - 1; i++) {
            int numberOne = array[i];
            for(int j = i + 1; j < array.length; j++) {
                int numberTwo = array[j];
                if(numberOne + numberTwo == targetSum) {
                    return new int[] {numberOne, numberTwo};
                }
            }
        }

        return new int[0];
    }
}

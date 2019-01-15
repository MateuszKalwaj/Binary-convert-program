package pl.mk.numbers_homework;

import java.util.Scanner;

public class TaskTwo {
    /**
     * @param args supplies command-line arguments as an array of String object
     */
    public static void main(String[] args) {

        //scanner implementation- for user input
        Scanner userInput = new Scanner(System.in);

        // user can define array size
        System.out.println("Enter array size");
        int arraySize = userInput.nextInt();

        // array size defined and implemented
        int[] index = new int[arraySize];

        //filling array with user inputs
        for (int i = 0; i < index.length; i++) {
            System.out.println("Enter " + (i + 1) + " number into array: ");
            index[i] = userInput.nextInt();
        }

        //set variables for max and min values
        int min = index[0];
        int max = index[0];

        //define what is min/max
        for (int i = 1; i < index.length; i++) {
            if (min > index[i]) {
                min = index[i];
            } else if (max < index[i]) {
                max = index[i];
            }
        }
        //print the values
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);

    }
}

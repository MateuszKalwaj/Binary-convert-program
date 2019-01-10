package pl.mk.numbers_homework;

import java.util.Scanner;

public class TaskOne {
    /**
     *
     * @param args supplies command-line arguments as an array of String object
     */
    public static void main(String[] args) {

        //scanner implementation- for user input
        Scanner userInput = new Scanner (System.in);

    //while with argument true means that it won't stop until 'break' condition applied
    while (true) {
        System.out.println("What's your number?");
        int userNumber = userInput.nextInt();

        if (userNumber == 42){
            System.out.println("Finally! Program is done.");
            break;
        }
    }
    }
}

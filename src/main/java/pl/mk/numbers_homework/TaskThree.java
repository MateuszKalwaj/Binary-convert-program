package pl.mk.numbers_homework;

import java.util.Scanner;

public class TaskThree {
    /**
     * @param args supplies command-line arguments as an array of String object
     */
    public static void main(String[] args) {
        //scanner implementation- for user input
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number from 1 to 15. I will convert it to binary");
        int number = userInput.nextInt();

        //protection if user enters value different than 1-15
        if (number > 15 || number < 0) {
            System.out.println("Wrong number, please use number between 1 to 15.");
        } else {
            //new array need tobe created for userInput data storage (4 bits reserved)
            int[] binArray = new int[4];

            System.out.print("Your number (" + number + ") in binary is: ");
            //filling array with user inputs. variable for iteration is provided

            for (int i = 0; i < binArray.length; i++) {
                binArray[i] = number % 2;
                number /= 2;
            } for (int i= 3; i >=0; i--){
                System.out.print(binArray[i]);
            }

        }
    }

}
package FRO;

import java.util.Scanner;
import java.util.Random;

public class byliusi {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {

        System.out.print("\n");
        int[] numbers = getArray(); // Creates array with random numbers

        System.out.print("\n");
        printArray(numbers, "Orignal Array: ");
        int[] sortedArray = sortArray(numbers);
        printArray(sortedArray, "Sorted Array : ");
        
        System.out.print("\n");
    }

    public static int[] sortArray(int[] arry) {

        for(int w = 0; w < arry.length-1; w++) {

        for(int i = 0; i < arry.length-1; i++) {
            int compare = arry[i]; // The variable compare is used to see if a number is swapped bc it's smaller
            arry[i] = getSmaller(arry[i], arry[i+1]);
            if (arry[i] != compare) { // If there is a change
                arry[i+1] = compare;
            }
        }
    }

        return arry;
    }

    public static int getSmaller(int a, int c) {
        // returns smaller interger
        if (a<c) {
            return a;
        } else if (a>c) {
            return c;
        } else {
            return c; // Doesn't matter the order if they the same
        }
    }

    public static int[] getArray() {
        // Makes an array with the user's desired length with random numbers in them
        System.out.print("Array Length: ");
        int arrayL = sc.nextInt();
        int[] reat = new int[arrayL];
        for(int i = 0; i < arrayL; i++) {
            reat[i] = rand.nextInt(0,arrayL*2)+1;
        }
        return reat;
    }

    public static void printArray(int[] arry, String text) {
        // Formats how I want the array to be printed out
        String coolness = "[";
        for(int i=0; i<arry.length; i++) {
            if (i==arry.length-1) { // If last iteration
                coolness = coolness + arry[i] + "]";
            } else {
                coolness = coolness + arry[i] + ", ";
            }
        }
        System.out.println(text + coolness);
    }

}
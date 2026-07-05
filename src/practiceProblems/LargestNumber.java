package practiceProblems;

import java.util.Scanner;

public class LargestNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int firstNum = input.nextInt();
        System.out.println("Enter the Second Number:");
        int secondNum = input.nextInt();
        System.out.println("Enter the Third Number:");
        int thirdNum = input.nextInt();

        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                System.out.println("First Number: " + firstNum + " is the Largest Number.");
            } else {
                System.out.println("Third Number: " + thirdNum + " is the Largest Number.");
            }
        } else if (secondNum > thirdNum) {
            System.out.println("Second Number: " + secondNum + " is the Largest Number.");
        } else {
            System.out.println("Third Number: " + thirdNum + " is the Largest Number.");
        }
        input.close();
    }
}
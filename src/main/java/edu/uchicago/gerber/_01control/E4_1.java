package edu.uchicago.gerber._01control;

import java.util.Scanner;


/**
 Name your source files according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your java source file P1_15
 */
public class E4_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //use the wrapper class Integer. Use diamond notation from Java7 and omit the right-hand "Integer" if you want
        int num;

        try {
            sumEven(2,100);
            sumSquare(1,100);
            powerOfTwo(0,20);
            sumOddBetween(scan);
            sumOddDigit(scan);


        } catch ( Exception e) {
            return;
        }

    }

    public static void sumEven(int start, int end){
        int sum=0;
        for(int i=start;i<=end;i+=2){
            sum+=i;
        }
        System.out.println("Sum of all even numbers between 2 and 100: "+sum);
    }

    public static void sumSquare(int start, int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=i*i;
        }
        System.out.println("Sum of all squares between 1 and 100: "+sum);
    }

    public static void powerOfTwo(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            System.out.println("2 power " + i + ": " + Math.pow(2, i));
        }
    }
    public static void sumOddBetween(Scanner scan){
        System.out.print("Enter the start number: ");
        int a = scan.nextInt();
        System.out.print("Enter the end number: ");
        int b = scan.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all odd numbers between " + a + " and " + b + ": " + sum);
    }

    public static void sumOddDigit(Scanner scan){
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            num /= 10;
        }

        System.out.println("Sum of all odd digit: " + sum);
    }

}

package Prtactice;

import java.text.BreakIterator;
import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int guessNumber = (int) (Math.random() * 100);
        do {
            System.out.println("guess the number(1-100)");
            num = scanner.nextInt();
            if (guessNumber == num) {
                System.out.println("Your guess is correct");
                break;
            } else if (guessNumber > num) {
                System.out.println("your number is too small");
            } else {
                System.out.println("Your number is too large");
            }

        }while (num >= 0) ;
        System.out.println();
        System.out.println("My Number was :" +guessNumber);
    }
}

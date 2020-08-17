package Chapter3;

import java.util.Scanner;

public class Sol12_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter theree digit number");
        int number = scan.nextInt();
        if ((number % 100 == number / 100)) {
            System.out.println("Your number is palindrome");
        } else {
            System.out.println("it is not a palindromme number");
        }
    }
}

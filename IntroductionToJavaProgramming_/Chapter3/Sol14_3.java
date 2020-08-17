package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class Sol14_3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your guess head(1)/tail(0)");
        int guess=scan.nextInt();

        int number= (int) (Math.random()*2);
        if(number==guess){
            System.out.println("Your guess is correct");
        }else{
            System.out.println("Your guess is wrong");
        }

    }
}

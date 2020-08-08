package Chapter2;

import java.util.Scanner;

public
class Sol2_6 {public static
void main( String[] args ) {
    Scanner scan=new Scanner( System.in);
    System.out.println ("Enter a number between 0 and 1000");
    int number=scan.nextInt ();
    int a=number%10;
    int b=number/100;
    int c=number/10;
    int d=c%10;
    System.out.println ("The sum of the digits is"+" "+(a+b+d));

}
}

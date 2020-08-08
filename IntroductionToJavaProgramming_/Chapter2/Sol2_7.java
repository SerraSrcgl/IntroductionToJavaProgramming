package Chapter2;

import java.util.Scanner;

public
class Sol2_7 {public static
void main( String[] args ) {
    Scanner scan=new Scanner( System.in);
    System.out.println ("Enter the number of minutes");
    int minutes=scan.nextInt ();
    int years=minutes/365*24*60;
    int remainingMinutes=minutes% 365*24*60;
    int days=remainingMinutes/24*60;
    System.out.println (minutes + " minutes is approximately " + years + " years and " + days + " days");

}
}

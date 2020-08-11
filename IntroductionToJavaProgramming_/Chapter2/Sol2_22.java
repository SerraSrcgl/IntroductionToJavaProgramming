import java.util.Scanner;

public
class Sol2_22 {
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Enter 4 digit number ");
        int n=scan.nextInt ();
        int cents=n%100;
        int dollars=n/100;
        System.out.println ("It is"+cents+"cents"+dollars+"dollars");

    }
}

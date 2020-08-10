import java.util.Scanner;

public
class Sol2_20 {
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance=scan.nextDouble ();
        double annualinterestrate=scan.nextDouble ();

        double interest = balance * (annualinterestrate / 1200);

        System.out.print("The interest is " + (float)interest);
    }
}

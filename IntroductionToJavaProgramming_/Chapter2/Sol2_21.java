import java.util.Scanner;

public
class Sol2_21 {
    public static
    void main( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Enter investment amount:" );
        double investment_amount = scan.nextDouble ();
        System.out.println ( "Enter annual interest rate in percentage:" );
        double aIR = scan.nextDouble ();
        System.out.println ( "Enter number of years:" );
        double years = scan.nextDouble ();
        double futureInvestmentValue = aIR * Math.pow((1 + investment_amount / 1200), 12 * years);

        System.out.print("Accumulated value is " + (float)futureInvestmentValue);


    }
}

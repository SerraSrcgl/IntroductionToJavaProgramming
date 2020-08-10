import java.util.Scanner;

public
class Sol2_12 {
    public static
    void main( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Enter speed and acceleration" );
        int speed=scan.nextInt ();
        int acceleration=scan.nextInt ();
        int length= (int) (Math.pow ( speed,2 )/2*acceleration);
        System.out.println ("The minimum runway length for this airplane is"+speed);

    }
}

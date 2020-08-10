import java.util.Scanner;

public
class Sol2_16 {
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Enter the side of the hexagon");
        double side=scan.nextDouble ();
        double area=(3*Math.sqrt ( 3 )/2)*Math.pow ( side,2 );
        System.out.println ("The area of the hexagon is"+area);
    }
}

import java.util.Scanner;

public
class Sol2_23 {
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Enter the driving distance:");
        double  driving_distance=scan.nextDouble ();
        System.out.println ("Enter miles per gallon:");
        double miles=scan.nextDouble ();
        System.out.println ("Enter price per gallon:");
        double price=scan.nextDouble ();
        double cost_of_driving=(driving_distance/miles)*price;
        System.out.println ("The cost of driving is"+" "+cost_of_driving+"$");

    }
}

import java.util.Scanner;

public
class Sol2_17 {
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println (" Enter the temperature in Fahrenheit between  -58°F and 41°F");
        double fahrenheit=scan.nextDouble ();
        System.out.println ("Enter the wind speed (>=2) in miles per hour:");
        double v=scan.nextDouble();
        double twc=35.74+(0.6215*fahrenheit)-(35.75*Math.pow ( v,0.16 ))+(0.4275*fahrenheit*Math.pow ( v,0.16 ));
        System.out.println ("The wind chill index is"+twc);


    }
}

package Chapter2;

import java.util.Scanner;

public
class Sol2_1 {
    public static
    void main( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Please enter celcius");
        Double celsius=scan.nextDouble ();
       // Double fahrenheit=scan.nextDouble ();
      Double   fahrenheit = (9 / 5) * celsius + 32;
        System.out.println (celsius+"Celsius is "+fahrenheit+" Fahrenheit");
    }
}
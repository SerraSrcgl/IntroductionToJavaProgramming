package Chapter2;

import java.net.Socket;
import java.util.Scanner;

public
class Sol2_3 {
    public static
    void main( String[] args ) {
        Scanner scan=new Scanner( System.in);
        System.out.println ("Enter the value for the feet");
        Double feet=scan.nextDouble ();
       Double feetCalculated =0.305*feet;
        System.out.println (feet+"feet is"+feetCalculated);

    }
}

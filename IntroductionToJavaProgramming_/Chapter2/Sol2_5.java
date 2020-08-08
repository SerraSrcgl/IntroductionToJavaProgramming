package Chapter2;

import java.util.Scanner;

public
class Sol2_5 {public static
void main( String[] args ) {
    Scanner scan=new Scanner( System.in);
    System.out.println ("Enter the subtotal and a gratuity rate:");
    Double subtotal=scan.nextDouble ();
    Double gratuityRate=scan.nextDouble ();
    Double gratuity=subtotal*(gratuityRate/100);
    Double total=gratuity+subtotal;
    System.out.println ("The gratuity is"+gratuity+"and total is"+total);

}
}

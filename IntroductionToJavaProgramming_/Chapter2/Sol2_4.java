package Chapter2;

import java.util.Scanner;

public
class Sol2_4 {
    public static
    void main( String[] args ) {
        Scanner scan=new Scanner( System.in);
        System.out.println ("Enter a number in pounds");
        Double pound=scan.nextDouble ();
        Double calculatedKilo=pound*0.454;
        System.out.println (pound+"pounds is"+calculatedKilo+"kilograms");
    }
}

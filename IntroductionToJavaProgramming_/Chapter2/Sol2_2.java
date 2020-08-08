package Chapter2;

import java.util.Scanner;

public
class Sol2_2 {
    public static
    void main( String[] args ) {
        Scanner scan=new Scanner( System.in);
        System.out.println ("Enter the radius and length of a cylinder:");
        Double radius=scan.nextDouble ();
        Double length=scan.nextDouble ();
        Double area = radius * radius * Math.PI;
        Double volume = area * length;
        System.out.println ("Area is"+area);
        System.out.println ("Volume is"+volume);
    }
}

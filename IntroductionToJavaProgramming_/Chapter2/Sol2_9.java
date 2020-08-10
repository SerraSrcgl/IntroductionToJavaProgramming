import java.util.Scanner;

public
class Sol2_9 {
    public static void main(String [] args){
        Scanner scan=new Scanner( System.in);
        double firstspeed=scan.nextDouble ();
        double secondspeed=scan.nextDouble ();
        double time=scan.nextDouble ();
        System.out.println ("Please enter v1,v2 and t");
        Double accelaration=(secondspeed-firstspeed)/time;
        System.out.println ("The average acceleration is"+accelaration);

    }
}

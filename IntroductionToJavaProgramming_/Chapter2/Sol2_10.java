import java.util.Scanner;

public
class Sol2_10 { public static void main(String [] args){
    Scanner scan=new Scanner( System.in);
    Double waterkg=scan.nextDouble ();
    System.out.println ("Enter the amount of water in kilograms:");
    Double initialtemprature=scan.nextDouble ();
    System.out.println ("Enter the initial temperature:");
    Double finalTemprature=scan.nextDouble ();
    System.out.println ("Enter the final temperature:");
    Double energyNeeded=waterkg*(finalTemprature-initialtemprature)*4184;
    System.out.println ("The energy needed is"+energyNeeded);

}
}

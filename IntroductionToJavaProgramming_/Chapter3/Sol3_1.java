import java.util.Scanner;

public
class Sol3_1 {
    public static void main(String [] args){
        Scanner scan=new Scanner ( System.in );
        System.out.println ("Enter a, b,c");
        int a=scan.nextInt ();
        int b=scan.nextInt ();
        int c=scan.nextInt ();
        int delta= (int) (Math.pow ( b, 2 )-4*a*c);
        if(delta>0){

            int r1= (int) ((-b+Math.sqrt ( delta ))/2*a);
            int r2=(int) ((-b-Math.sqrt ( delta ))/2*a);
            System.out.println ("It has two roots"+r1+" "+r2);
        }else if(delta==0){
            int root=-b/2*a;
            System.out.println ("It has one root"+root);
        }else{
            System.out.println ("The equation has no real root");
        }
    }
}

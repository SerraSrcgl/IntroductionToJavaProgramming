import java.util.Scanner;
/*(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the fol- lowing 2 * 2 system of linear equation:
ax + by = e
 ed - bf af - ec x= y=
Programming Exercises 31
  cx + dy = f ad - bc ad - bc
Write a program that solves the following equation and displays the value for x and y :
3.4x + 50.2y = 44.5 2.1x + .55y = 5.9*/
public
class Sol3_3 { public static void main(String [] args){
Scanner scan=new Scanner ( System.in );
    System.out.println ("Enter a,b,c,d,e,f  for craers rule");
Double a=scan.nextDouble ();
    Double b=scan.nextDouble ();

    Double c=scan.nextDouble ();

    Double d=scan.nextDouble ();

    Double e=scan.nextDouble ();

    Double f=scan.nextDouble ();

    if(a*d-b*c==0)
        System.out.println ("The equation has no solution");

    else{
        double x=(e*d-b*f)/(d*a-b*c);
        double y=(a*f-e*c)/(a*d-b*c);

        System.out.println ("x is"+x+"y is"+y);
    }
}
}

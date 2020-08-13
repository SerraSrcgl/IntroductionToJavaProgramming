import java.util.Scanner;

public
class Sol3_6 { public static void main(String [] args){
    Scanner scan=new Scanner ( System.in);
    System.out.println ("Pease enter feet");
    int feet=scan.nextInt ();

    System.out.println ("Please enter inches ");
    int inch=scan.nextInt ();

    System.out.println ("Please enter weight in pounds");
    int weight=scan.nextInt ();

int BMI=weight/inch/inch;
    if (BMI < 18)
        System.out.println("Underweight");
    else if (BMI < 25)
        System.out.println("Normal");
    else if (BMI < 30)
        System.out.println("Overweight");
    else
        System.out.println("Obese");

}
}

import java.util.Scanner;

public
class Sol2_14 { public static void main(String [] args){
    Scanner scan=new Scanner( System.in);
    int weight_pounds=scan.nextInt ();
    int height_inches=scan.nextInt ();
    int kg_= (int) (weight_pounds*0.45359237);
    int meter_= (int) (height_inches*0.0254);
    int BMI= (int) (kg_/meter_*( meter_ ));
    System.out.println ("BMI is"+BMI);


}
}

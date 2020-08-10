import java.util.Scanner;

public
class Sol2_19 {
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Enter three x and y  points for a triangle:");
        Double x1=scan.nextDouble ();
        Double y1=scan.nextDouble ();
        Double x2=scan.nextDouble ();
        Double y2=scan.nextDouble ();
        Double x3=scan.nextDouble ();
        Double y3=scan.nextDouble ();

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        double side3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side = (side1 + side2 + side3) / 2;
        double area = Math.pow(side * (side - side1) * (side - side2) * (side - side3) , 0.5);

        System.out.println("The area of the triangle is " + (float)area);

    }

    }

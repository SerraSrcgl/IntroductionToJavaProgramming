package Chapter4;

import java.util.Scanner;

public class Sol4_4 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = scan.nextDouble();

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6));
        System.out.println(area);
    }
}

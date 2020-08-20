package Chapter4;

import java.util.Scanner;

public class Sol4_2 {
    public static void main(String[] args){
        final double EARTH_RADIUS = 6371.01;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double latitude1 = scan.nextDouble();
        double longitude1 = scan.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double latitude2 = scan.nextDouble();
        double longitude2 = scan.nextDouble();

        double distance = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2))
                + Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2))
                * Math.cos(Math.toRadians(longitude1) - Math.toRadians(longitude2)));

        System.out.println( distance);
    }
}

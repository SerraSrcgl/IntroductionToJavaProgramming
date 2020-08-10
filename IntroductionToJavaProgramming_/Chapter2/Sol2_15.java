import java.util.Scanner;

public
class Sol2_15 {
    public static void main(String [] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Enter x1 and y1: ");
        int x1=scan.nextInt ();
        int y1=scan.nextInt ();
        int x2=scan.nextInt ();
        int y2=scan.nextInt ();
        int distance= (int) Math.sqrt ( Math.pow ( x2-x1, 2)+Math.pow ( y2-y1 , 2));
    }
}

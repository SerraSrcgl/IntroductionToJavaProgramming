import java.util.Scanner;

public
class Sol3_5 {
    public static
    void main( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Please enter today's day" );
        int today = scan.nextInt ();
        System.out.println ( "Please enter future day" );
        int future = scan.nextInt ();

        switch (today%7) {
            case 0:
                System.out.println ( "Today is Sunday " );
                break;
            case 1:
                System.out.println ( "Today is Monday " );
                break;
            case 2:
                System.out.println ( "Today is Tuesday " );
                break;
            case 3:
                System.out.println ( "Today is Wednesday " );
                break;
            case 4:
                System.out.println ( "Today is Thursday " );
                break;
            case 5:
                System.out.println ( "Today is Friday " );
                break;
            case 6:
                System.out.println ( "Today is Saturday " );
                break;
        }

            switch ((future + today)%7) {
                case 0:
                    System.out.println ( "Future is Sunday " );
                    break;
                case 1:
                    System.out.println ( "Future is Monday " );
                    break;
                case 2:
                    System.out.println ( "Future is Tuesday " );
                    break;
                case 3:
                    System.out.println ( "Future is Wednesday " );
                    break;
                case 4:
                    System.out.println ( "Future is Thursday " );
                    break;
                case 5:
                    System.out.println ( "Future is Friday " );
                    break;
                case 6:
                    System.out.println ( "Future is Saturday " );
                    break;

            }
        }
    }


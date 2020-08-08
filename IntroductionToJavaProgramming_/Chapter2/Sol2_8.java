package Chapter2;

import java.util.Scanner;

public
class Sol2_8 {public static
void main( String[] args ) {
    Scanner scan=new Scanner( System.in);
    System.out.println ("Enter the time zone offset to GMT");
    Double timeZoneChange = scan.nextDouble();

    Double totalMilliseconds = Double.valueOf ( System.currentTimeMillis() );

    Double totalSeconds = totalMilliseconds / 1000;

    Double currentSecond = totalSeconds % 60;

    Double totalMinutes = totalSeconds / 60;

    Double currentMinute = totalMinutes % 60;

    Double totalHours = totalMinutes / 60;

    Double currentHour = ((totalHours + timeZoneChange) % 24);

    System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
}

}

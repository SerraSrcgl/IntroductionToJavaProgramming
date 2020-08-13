import java.util.Scanner;

public
class Sol3_2 { public static void main(String [] args){


Scanner scan=new Scanner ( System.in);
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 7 % 10);
    int number3 = (int)(System.currentTimeMillis() / 100 % 10);
    int totalReal = number1 + number2 + number3;

    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
    int totalUser = scan.nextInt();

    System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + totalUser + " is " +
                             (totalReal == totalUser ? true : false));

}

}

import java.util.Scanner;

public
class Sol2_13 { public static void main(String [] args){
    Scanner scan=new Scanner( System.in);
    System.out.println ("Enter the monthly saving amount");
    int amount=scan.nextInt ();
    int interestrate= (int) 0.00417;
    int first_account=amount*(1+interestrate);
    int second_accout=(amount+first_account)*(1+interestrate);
    int third_account=(amount+second_accout)*(1+interestrate);
    int fourth_account=(amount+third_account)*(1+interestrate);
    int fifth_account=(amount+fourth_account)*(1+interestrate);
    int sixth_account=(amount+fifth_account)*(1+interestrate);
    System.out.println ("After the sixth month, the account value is"+sixth_account);


}
}

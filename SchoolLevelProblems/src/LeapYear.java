import java.util.Scanner;

public class LeapYear {
    public static boolean leapYear(int n){
        if(n%4==0){
            if(n%100==0){
                return n%400==0;
            }
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();

        boolean leap=leapYear(n);
        System.out.print("is "+n+" a leap year? "+leap);

    }
}

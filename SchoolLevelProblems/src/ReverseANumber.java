import java.util.Scanner;

public class ReverseANumber {
    public static int reverseNum(int n){
        int reverse=0;

        while(n>0){
            reverse=reverse*10 + n %10;
            n=n/10;
        }
        return reverse;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();
        int reverse=reverseNum(n);

        System.out.print("the reversed number of "+n+" is "+reverse);

    }
}

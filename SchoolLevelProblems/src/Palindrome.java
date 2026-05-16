import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        int reverse=0;
        int num=x;

        if(x<0){
            return false;
        }

        while(x>0){
            reverse=reverse*10 + x %10;
            x=x/10;
        }

        if(num==reverse){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();

        boolean palindrome=isPalindrome(n);

        System.out.print("is "+n+" palindrome? "+palindrome);


    }
}

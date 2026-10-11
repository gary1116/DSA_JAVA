import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        int reverse=0;
        int num=x;
        while(num>0){
            reverse=reverse*10+num%10;
            num=num/10;
        }
        if(reverse==x){
            return true;
        }else return false;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want to check palindrome for:- ");
        int n = sc.nextInt();

        boolean palindrome=isPalindrome(n);

        System.out.print("is "+n+" palindrome? "+palindrome);


    }
}

package basic;

import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(int n){
        int original=n;
        int reverseNum=0;
        while(n>0){
            int lastdigit=n%10;
            reverseNum=reverseNum*10+lastdigit;
            n=n/10;
        }
        if(reverseNum==original){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number you want to reverse:-");
        int num=sc.nextInt();

        boolean value=palindrome(num);
        System.out.println("is it palindrome:- "+ value);
    }
}

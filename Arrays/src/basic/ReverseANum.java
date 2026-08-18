package basic;

import java.util.Scanner;

public class ReverseANum {
    public static int reversed(int num){
        num=Math.abs(num);

        int reverseNum=0;
        while(num>0){
            int lastDigit= num%10;
            reverseNum=reverseNum*10+lastDigit;
            num=num/10;
        }
        return reverseNum;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number you want to reverse:-");
        int num=sc.nextInt();

        int reverseNum=reversed(num);
        System.out.println("the reversed num is:- "+ reverseNum);
    }
}

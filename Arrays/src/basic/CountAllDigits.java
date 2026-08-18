package basic;

import java.util.Scanner;

public class CountAllDigits {

    public static int countDigits(int n){
        n=Math.abs(n);
        int count=0;
        if(n==0){
            return -1;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number you want digits from:-");
        int num=sc.nextInt();

        int count=countDigits(num);
        System.out.println("the digits are:- "+ count);
    }
}

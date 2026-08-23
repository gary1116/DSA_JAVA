package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Armstrong {

    public static boolean armstrongNumber(int n){
       int original=n;
       List<Integer> list= new ArrayList<>();
       int count=0;
       while(n>0){
           n=n/10;
           count++;
       }
       n=original;
       while(n>0){
           list.add(n%10);
           n=n/10;
       }
       int power=count;
        int armstrongNum=list.stream()
                .mapToInt(digit->(int)Math.pow(digit,power))
                .sum();
        if(armstrongNum==original){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number you want to check:-");
        int num=sc.nextInt();

        boolean value=armstrongNumber(num);
        System.out.println("is it armstrong?:- "+ value);
    }
}

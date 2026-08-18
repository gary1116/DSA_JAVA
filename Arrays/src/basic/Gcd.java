package basic;

import java.util.Scanner;

public class Gcd {

    public static int greatestCommonDivisor(int num1,int num2){
        while(num1>0 &&num2>0){
            if(num1>num2){
                num1=num1%num2;
            }else{
                num2=num2%num1;
            }
        }
        if(num1==0){
            return num2;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number1:-");
        int num1=sc.nextInt();

        System.out.println("enter the number2:-");
        int num2=sc.nextInt();

        int value=greatestCommonDivisor(num1,num2);
        System.out.println("the gcd is:- "+ value);
    }
}

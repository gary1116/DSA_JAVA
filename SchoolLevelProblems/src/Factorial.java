import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {

    public static int factorialOfANum(int n){
       if(n==0){
           return 0;
       }else if(n==1){
           return 1;
       }

       return IntStream.rangeClosed(1,n)
               .reduce(1,(a,b)->a*b);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();

        int factorial = factorialOfANum(n);
        System.out.print("the factorial is:- " + factorial);
    }
}

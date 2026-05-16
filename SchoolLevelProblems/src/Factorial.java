import java.util.Scanner;

public class Factorial {

    public static int factorialOfANum(int n){
        int num=1;
        if(n==0 ){
            return 0;
        }else if(n==1){
            return 1;
        }

        for(int i=n;i>=1;i--){
            num=num*i;
        }
            return num;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();

        int factorial = factorialOfANum(n);
        System.out.print("the factorial is:- " + factorial);
    }
}

import java.util.Scanner;

//input: n = 29
//Output: 29 is prime
//Explanation: 29 has no divisors other than 1 and 29 itself. Hence, it is a prime number.
//
//        Input: n = 15
//Output: 15 is NOT prime
//Explanation: 15 has divisors other than 1 and 15 (i.e., 3 and 5). Hence, it is not a prime number.
public class PrimeNumber {

    static boolean checkPrime(int n){
        int divisor=0;

        if(n>0){
            for(int i=1;i<=n;i++){
                if(n % i == 0){
                    divisor++;
                }
            }
        }

        if(divisor==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();

        boolean prime=checkPrime(n);

        System.out.print("is "+n+" prime number? "+prime);


    }
}

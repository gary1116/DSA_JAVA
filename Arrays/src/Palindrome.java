import java.util.Scanner;

public class Palindrome {

    private static boolean isPalindrome(int n){
        int og=n;
        int reversed=0;
        while(n>0){
            int lastDigit=n%10;
            reversed=(reversed*10)+lastDigit;
            n=n/10;

        }
        if(og==reversed){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num=sc.nextInt();

        boolean palindrome= isPalindrome(num);

        System.out.print("is the number palindrome?:- "+palindrome);
    }
}

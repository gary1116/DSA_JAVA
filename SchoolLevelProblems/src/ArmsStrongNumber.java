import java.util.Scanner;

public class ArmsStrongNumber {
    public static boolean armstrongNumber(int n){

        int original=n;
        int armstrong=0;
        int temp=0;
        while(n>0){
            temp=n*10+n%10;
            armstrong=temp*3+armstrong;
            n=n/10;
        }
        if(armstrong==original){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount you want the sum for:- ");
        int n = sc.nextInt();

        boolean armstrong = armstrongNumber(n);
        System.out.print("is it an armstrong number?:- " + armstrong);

    }
}

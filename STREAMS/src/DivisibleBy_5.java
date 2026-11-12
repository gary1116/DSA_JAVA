import java.util.Arrays;
import java.util.Scanner;

public class DivisibleBy_5 {

    public static int [] checkIfDivisibleBy5(int [] arr){
        return Arrays.stream(arr).filter(i->i%5==0).toArray();
    }

    public static boolean checkIfAnyDisableBy5(int [] arr){
        return Arrays.stream(arr).anyMatch(i->i%5==0);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array:-");
        int len= sc.nextInt();
        System.out.println("enter the values of array:-");
        int [] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int[] result= checkIfDivisibleBy5(arr);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        boolean value=checkIfAnyDisableBy5(arr);
        System.out.println("So was there a value divisible by 5 in that array?:- "+value);

    }
}

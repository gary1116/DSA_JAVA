import java.util.Arrays;
import java.util.Scanner;

public class AllPositive {

    public static boolean checkIfAllPositive(int [] arr){
        return !Arrays.stream(arr).anyMatch(i->i<=0);
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

       boolean result= checkIfAllPositive(arr);
        System.out.println("were all positive? "+result);

    }
}

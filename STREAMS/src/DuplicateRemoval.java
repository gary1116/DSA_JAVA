import java.util.Arrays;
import java.util.Scanner;

public class DuplicateRemoval {

    public static int[] removeDuplicates(int [] arr){
        return Arrays.stream(arr).distinct().toArray();
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

        int []square=removeDuplicates(arr);

        for(int a:square){
            System.out.println(a);
        }

    }
}

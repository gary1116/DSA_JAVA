import java.util.Arrays;
import java.util.Scanner;

public class AllEven {

    public static int[] findAllEven(int []arr){
        int [] even= Arrays.stream(arr).filter(i->i%2==0).toArray();
        return even;
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

        int []even=findAllEven(arr);

        for(int a:even){
            System.out.println(a);
        }

    }
}

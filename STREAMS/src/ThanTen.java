import java.util.Arrays;
import java.util.Scanner;

public class ThanTen {

    public static int[] greaterThan10(int []arr){
        return Arrays.stream(arr).filter(i->i>10).toArray();
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

        int []ten=greaterThan10(arr);

        for(int a:ten){
            System.out.println(a);
        }

    }
}

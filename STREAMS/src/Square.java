import java.util.Arrays;
import java.util.Scanner;

public class Square {

    public static int [] getSquare(int [] arr){
        return Arrays.stream(arr).map(i->i*i).toArray();
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

        int []square=getSquare(arr);

        for(int a:square){
            System.out.println(a);
        }

    }
}

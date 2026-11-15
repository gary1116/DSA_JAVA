import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DivisibleBy3 {

    public static int[] findDivisibleBy3(int []arr){
        return Arrays.stream(arr).filter(i->i%3==0).toArray();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int[] result= findDivisibleBy3(arr);


        for(int num:result){
            System.out.println(num);
        }

    }
}

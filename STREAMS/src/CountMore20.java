import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CountMore20 {

    public static int counting(int [] arr){
        return Math.toIntExact(Arrays.stream(arr).filter(i -> i > 20).count());
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int result= counting(arr);


        System.out.println("there are "+ result+" values greater than 20");

    }
}

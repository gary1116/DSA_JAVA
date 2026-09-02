package Medium;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StockBuySell {

    public static int buyAndSell(int[] arr){
        int max=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                   int sum=arr[j]-arr[i];
                max= Math.max(max,sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers:-");

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        long maxProfit=buyAndSell(arr);

        System.out.println("The majority element is :- "+maxProfit);

    }
}

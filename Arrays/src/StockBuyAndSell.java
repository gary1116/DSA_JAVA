import java.util.Scanner;

public class StockBuyAndSell {

    private static int buyAndSell(int arr[]){

     int min=arr[0];
     int maxPropfit=0;
     for(int i=1;i<arr.length;i++){
         int cost=min-arr[i];
         maxPropfit=Math.max(maxPropfit,cost);
         min=Math.min(min,arr[i]);
     }
     return maxPropfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:- ");
        int len=sc.nextInt();
        int [] arr=new int[len];
        System.out.println("Now Enter the numbers for array:- ");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int maximum= buyAndSell(arr);

        System.out.print(" the maximum profit you can get is:- "+maximum);
    }
}

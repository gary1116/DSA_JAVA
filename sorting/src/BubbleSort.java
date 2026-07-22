import java.util.Scanner;

public class BubbleSort {

    public static int [] bubbleSort(int [] arr){

        for(int i=arr.length-1;i>=1;i--){

            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        return arr;

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

        int [] sorted= bubbleSort(arr);

        for(int i=0;i<len;i++){
            System.out.print(sorted[i]+" ");
        }
    }
}

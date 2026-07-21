import java.util.Scanner;

public class selectionSort {

    public static int [] selectSort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
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

        int [] sorted= selectSort(arr);

        for(int i=0;i<len;i++){
            System.out.print(sorted[i]+" ");
        }
    }
}

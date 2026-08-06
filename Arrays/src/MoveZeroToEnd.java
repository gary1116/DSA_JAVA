import java.util.Scanner;

public class MoveZeroToEnd {

    public static int[] moveZero(int [] arr){
        int j=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return arr;
        }

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
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
        int [] arr2 = moveZero(arr);

        System.out.print("Array after moving 0 to end: ");
        for (int x = 0; x < arr2.length; x++) {
            System.out.print(arr2[x] + " ");
        }
    }
}

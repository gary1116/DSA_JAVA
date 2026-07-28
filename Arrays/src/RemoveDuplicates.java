import java.util.Scanner;
/**

 remove duplicates and place them at the start of array no need to remove the duplicates at the last
 1 1 2 2 3 3 4
 becomes
 1 2 3 4 3 3 4

 */

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
       int i=0;
        for(int j=1;j<nums.length;j++){
           if(nums[j]!=nums[i]){
               i++;
               nums[i]=nums[j];
           }
       }
        return i+1;
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
        int k = removeDuplicates(arr);

        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}

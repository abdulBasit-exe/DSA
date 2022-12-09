package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr = ArrayInputOutput.inputArray(size);
        System.out.print("Enter the target to found from the array: ");
        int target=sc.nextInt();

        System.out.println(BinarySearch(arr,target));

    }
    private static int BinarySearch(int[] arr, int target){
        int low=0;
        int high=arr.length-1;

        while (high-low>1){
            int middle= (low+high)/2;

            if (arr[middle]<target){
                low=middle+1;
            }
            else{
                high=middle;
            }
        }
        if(arr[low]==target){
            System.out.print("Target found at: ");
            return low;
        }
        else if(arr[high]==target){
            System.out.print("Target found at: ");
            return high;
        }
        else {
            System.out.print("Target not found!...");
            return -1;
        }
    }
}

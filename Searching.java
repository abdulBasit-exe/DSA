package Array;

import java.util.Scanner;

public class LenearSearching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter array:");
        int arr[] = ArrayLabTask.inputArray(4);

        System.out.println("Enter the target: ");
        int target= sc.nextInt();

        search(target,arr);
    }
    public static void search(int target,int [] arr){
        int targetAt=0;
        boolean targetFound=false;
        for (int i=0; i<arr.length;i++){
            if(target==arr[i]){
                targetAt=i;
                targetFound=true;

            }
        }
        if (targetFound){
            System.out.print("Target is at index: "+targetAt);

        }
        else  System.out.println("Target not found in the array.");


    }
}

package Array;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        outputArray(inputArray(size));
    }
    public static int[] inputArray(int size){
        int[] arr= new int[size];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<size;i++){
            System.out.print("Enter element of "+(i+1)+" index: ");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void outputArray(int [] arr){
        System.out.print("array is : ");
        System.out.print("[");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
}



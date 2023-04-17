package Array;

import java.util.Scanner;

public class arrayInsertion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Enter index to input new element at: ");
        Scanner sc= new Scanner(System.in);
        int m =sc.nextInt();
        System.out.println("Enter value to input : ");
        int newElement = sc.nextInt();

        int[] newArray = new int[arr.length+1];

        for (int i=0;i<=arr.length;i++){
            if (i<m){
                newArray[i] = arr[i];
            }
            else if (i==m){
                newArray[i]= newElement;
            }
            else if(i>m){
                newArray[i] = arr[i-1];
            }
        }

        for (int j: newArray){
            System.out.print(j+" ");
        }

    }
}

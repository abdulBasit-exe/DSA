package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_ArrayProblem {
    public static void main(String[] args) {
        int temo=0,t;
        int[][] array= new int[3][10];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<3;i++){
            System.out.println("Enter values for row "+(i+1));
            for(int j=0;j<10;j++){
                array[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Array is: ");
        for(int[] row: array){
            System.out.println(Arrays.toString(row));
        }
        int[] oneDArray= new int[30];

        // Converting into one-D array

        for (int row = 0; row <3; row++) {
            for (int col = 0; col < 10; col++) {
                t= array[row][col];
                oneDArray[temo]= t;
                temo++;

            }

        }
        System.out.print("After Converted to one d Array: \n[");
        for(int i =0;i<oneDArray.length;i++) {
            System.out.print(" "+oneDArray[i]+" ");
        }
        System.out.println("]");

        insertionSort(oneDArray);

        System.out.println("After sorting: ");
        for(int i =0;i<oneDArray.length;i++) {
            System.out.print(" "+oneDArray[i]+" ");
        }

        System.out.println( BinarySearch.binarySearch(oneDArray,17));



        }
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }


    }

package DSATest;

import java.util.Arrays;

public class ArrayQue {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6};
        int[] arr2 = {7,8,9};
        int sum = 0;

        if (arr1.length > 0) {
            sum += arr1[arr1.length - 1];
        }

        if (arr2.length > 0) {
            sum += arr2[arr2.length - 1];
        }

        System.out.println("Sum :"+sum);
    }
}
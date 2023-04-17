package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = ArrayInputOutput.inputArray(size);
        System.out.print("Enter the target to found from the array: ");
        int target = sc.nextInt();

        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int middle;
        while (high - low > 1) {
            middle = (low + high) / 2;
            if (arr[middle] < target) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }
            if (arr[low] == target) {
                return low + 1;
            } else if (arr[high] == target) {

                return high + 1;
            } else {
                return -1;
            }
        }
    }

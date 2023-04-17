package Array;
public class SelectionSort {
    public static void main(String args[]) {
        int array[] = {100, 92, 8, 49, 0, 81, 833, 41};
        selectionSort(array);
        System.out.println("Sorted array");
        // Printing Array.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
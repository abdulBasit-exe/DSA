package DSA_Lab;

public class Lab3 {
    // 1- linear 1D
    public static int LinearSearch1D(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.print("Element found at: ");
                return i;
            }
        }
        return -1;
    }


    // 2- linear 2D
    public static void LinearSearch2D(int[][] mat, int target) {

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < row; col++) {
                if (mat[row][col] == target) {
                    System.out.print("Found at: ");
                    System.out.print(row+" ");
                    System.out.println(col);
                    return;
                }

            }
        }
          System.out.println("Not Found");

    }

    // 3- Binary 1D

    public static int binarySearch_1D(int[] arr, int target){
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

            return low+1;
        }
        else if(arr[high]==target){

            return high+1;
        }
        else {
            return -1;
        }
    }


    // 4- Binary 2D


    public static int binarySearch2D(int mat[][], int searchValue){
        int rows = mat.length;
        int cols = mat[0].length;
        int start = 0;
        int end = rows * cols - 1;
        int mid, midRow, midCol, midVal;

        while (start <= end) {
            mid = (start + end) / 2;
            midRow = mid / cols;
            midCol = mid % cols;
            midVal = mat[midRow][midCol];

            if (midVal == searchValue){
                // Return 1 if target found
                System.out.println(midRow+","+midCol);
                return 1;

            } else if (midVal > searchValue) {
                end = mid - 1;

            } else if (midVal < searchValue){
                start = mid + 1;
            }
        }
        // Return 0 if not found
        return -1;
    }
}



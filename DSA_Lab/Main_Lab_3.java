package DSA_Lab;

public class Main_Lab_3 {
    public static void main(String[] args) {
         long beforeLinear1D=System.nanoTime();
        int[] arr={1,2,3,9,4,65};

        int index=Lab3.LinearSearch1D(arr,65);
        if (index==-1){
            System.out.println("not found!");
        }
        else{
            System.out.println("found at:"+index);

        }
        long afterLinear1D= System.nanoTime();
        System.out.println("Time taken by Linear 1D: "+(afterLinear1D-beforeLinear1D));

        long beforeLinear2D = System.nanoTime();
        int matrix1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Lab3.LinearSearch2D(matrix1,4);
        long afterLinear2D= System.nanoTime();
        System.out.println("Time taken by Linear 2D: "+(afterLinear2D-beforeLinear2D));

        int[] array2={1,2,4,56,65};
        long beforeBinary1D = System.nanoTime();
        int indexB1D =Lab3.binarySearch_1D(array2,4);
        System.out.println(indexB1D);
        long afterBinary1D = System.nanoTime();
        System.out.println("Time taken by Binary 1D: "+(afterBinary1D-beforeBinary1D));

        int[][] matrix2 = {{1,2},{3,4},{5,6}};
        long beforeBinary2D = System.nanoTime();
        Lab3.binarySearch2D(matrix2,4);
        long afterBinary2D = System.nanoTime();
        System.out.println("Time taken by Binary 2D: "+(afterBinary2D-beforeBinary2D));
//    }

//



    }
}


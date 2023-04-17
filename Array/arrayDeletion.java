package Array;

public class arrayDeletion {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        deletetion(arr,2);

    }
    public static void deletetion(int[] arr, int index){
        int[] newArray = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if (i<index){
                newArray[i] = arr[i];
            } else if (i==index) {
                continue;
            }
            else {
                newArray[i-1] = arr[i];
            }
        }

        for (int i:newArray) System.out.print(i);


    }
    }


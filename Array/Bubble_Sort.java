package Array;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr= {1,2,9,7,0,925,3,4,100,50,78};
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int[] arr){
        int n=arr.length-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

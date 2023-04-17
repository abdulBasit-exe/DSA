package Array;

public class deleteInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        deleteElement(arr,5);
    }

    public static void deleteElement(int[] arr, int target) {
        int count =0;
        for(int i =0; i<arr.length;i++){
            if (target==arr[i]){
               for (int j=i;j<arr.length-1;j++){
                   arr[j]=arr[j+1];
               }
               count+=1;
               break;
            }
        }
        if (count==0){
            System.out.println("Element not found!");
        }
        else System.out.println("Elements deleted successfully");

        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

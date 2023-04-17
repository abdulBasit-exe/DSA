package Array;

public class insertingArray {
    public static void main(String[] args) {
        int arr[] = {1,5,7,9,11};
        newArray(arr,100,4);

    }
    public static void newArray(int[] oldArray, int element, int index){
        int[] newArray = new int[oldArray.length+1];
        for (int i =0; i<newArray.length; i++) {
            if (i<index){
                newArray[i]=oldArray[i];
            }
            else if (i==index) {
                newArray[i]=element;
            }
            else {
                newArray[i] = oldArray[i-1];
            }
        }
        System.out.println("old array was: ");
        for (int i= 0; i<=oldArray.length-1;i++){
            System.out.print(oldArray[i]+" ");
        }
        System.out.println("");
        System.out.println("new array is: ");
        for (int i= 0; i<=newArray.length-1;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}

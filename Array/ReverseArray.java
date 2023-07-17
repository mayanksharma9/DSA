import java.util.Arrays;

class ReverseArray{
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        printArray(arr,5);
        reverseArray(arr, 0, 4);
        System.out.println("Reversed array is");
        printArray(arr, 5);
    }

    private static void reverseArray(int arr[] , int start , int end) {
        int temp;
        if (start>=end) 
            return;
            temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            reverseArray(arr, start+1, end-1);        

    }

    private static void printArray(int arr[], int size) {
        for (int i=0; i < size; i++){
            System.out.println(arr[i] + "");
            System.out.println("");
    }
}}
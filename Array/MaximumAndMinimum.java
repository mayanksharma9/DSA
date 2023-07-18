import java.lang.reflect.Array;
import java.util.Arrays;


class Pair{
    public int min;
    public int max;
}

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int arr[] = {40,50,60,70,80,90};
        int arr_size = arr.length;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.println("Min element is " + minmax.min);
        System.out.println("Max element is "+minmax.max);
        
    }

    private static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[n-1];
        return minmax;
    }
}

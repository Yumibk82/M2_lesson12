import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {6,5,3,1,8,7,2,4};
        int[] b = bubbleSort(a,8);
        System.out.println(Arrays.toString(a));
    }
    private static int[] bubbleSort(int[] arr,int length){
        int temp;
        int count;
        int index;

        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }
}

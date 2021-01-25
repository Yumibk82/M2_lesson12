import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {6,5,3,1,8,7,2,4};
        int[] b = selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    private static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=arr[i];
            int index=i;
            for (int j = i+1; j < arr.length; j++) {
                if(min>arr[j]){
                    min = arr[j];
                    index=j;
                }
            }
            if(index!=i){
                arr[index]=arr[i];
                arr[i]=min;
            }
        }
        return arr;

    }
}
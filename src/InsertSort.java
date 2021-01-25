import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] a = {6,5,3,1,8,7,2,4};
        System.out.println(Arrays.toString(a));
        int[] b = insertSort(a,8);
        System.out.println(Arrays.toString(a));
    }
    private static int[] insertSort(int[] arr,int length){
        int j;
        int temp;
        for (int i = 1; i < length; i++) {
            j=i-1;
            temp=arr[i];
            while ((j>=0)&&(temp<arr[j])){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;

    }
}
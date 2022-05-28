import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args){

           int[] a = {1,2,3,4,50};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    private static int[] reverse1(int[] arr){
        int[] rev = new int[arr.length];
        for (int i = arr.length-1;i>=0;i--){
            rev[arr.length-1-i] = arr[i];
        }
        return rev;
    }
    private static void reverse(int[] array){
        System.out.println("Array = "+Arrays.toString(array));
        int temp;
        int length = array.length;
        int middle = length/2;
        for (int i=0;i<middle;i++){
            //swap first and last element, second and second-last, ans so on
            temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }
        System.out.println("Reversed Array = "+Arrays.toString(array));
    }
}

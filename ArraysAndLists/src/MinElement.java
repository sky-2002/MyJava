import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    //private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println(findMin(readElements(5)));
    }
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        for (int i=0;i<arr.length;i++){
            int num = scanner.nextInt();// if we only write this, we can use space as well
            // newline as delimiter.
            scanner.nextLine(); // this will not consider anything written aster space
            arr[i] = num;
        }
        return arr;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min)
                    min = arr[i];
        }
        return min;
    }
}

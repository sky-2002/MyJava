import java.util.Arrays;
import java.util.Scanner;

public class SortDescending {
    //private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myArray = getIntegers(5);
        printArray(myArray);
        printArray(sortIntegers(myArray));
        int[] cp = Arrays.copyOf(myArray,3);
        printArray(cp);
    }
    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[number];
        System.out.println("Enter "+number+" integers:");
        for (int i = 0;i<myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = new int[arr.length];
        for (int i =0;i<arr.length;i++){
            sortedArray[i] = arr[i];
        }
        int temp;
        boolean flag = true;
        while (flag){
            flag=false;

            for (int i=0;i<arr.length-1;i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}

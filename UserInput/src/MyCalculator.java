import java.util.Scanner;

public class MyCalculator {

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter op code");
        boolean hasNextInt = scanner.hasNextInt();

        int op = scanner.nextInt();

        if(! hasNextInt) System.out.println("Invalid op code");
        System.out.println("Enter operand 1");

        if(! hasNextInt) System.out.println("Invalid operand");
        int a = scanner.nextInt();

        System.out.println("Enter operand 2");
        if(! hasNextInt) System.out.println("Invalid operand");
        int b = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println(add(a, b));
                break;
            case 2:
                System.out.println(sub(a, b));
                break;
            case 3:
                System.out.println(mul(a, b));
                break;
            case 4:
                System.out.println(div(a, b));
                break;
        }
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int sub(int a,int b){
        return a-b;
    }

    public static int mul(int a,int b){
        return a*b;
    }

    public static float div(int a,int b){
        if(b==0){
            System.out.println("Denominator cannot be 0");
            return 0;
        }
        return a/b;
    }
}

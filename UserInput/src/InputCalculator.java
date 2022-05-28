import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int num = scanner.nextInt();
                sum+=num;
                cnt+=1;
            }else {
                if (cnt!=0)
                    System.out.println("SUM = "+sum+" AVG = "+Math.round((double)sum/cnt));
                else
                    System.out.println("SUM = "+0+" AVG = "+0);
                break;
            }
        }
    }
}

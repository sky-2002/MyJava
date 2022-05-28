import java.util.Scanner;

public class add_10 {

    public static int add_10_numbers(){
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int count = 0;
        System.out.print("How many numbers would you like to sum ?");
        int nos = scanner.nextInt();
        System.out.println("Enter "+nos+" numbers(press enter after each):");

        do {
            int order = count + 1;
            System.out.println("Enter number " + order);
            // hasNextInt checks if we enter an integer
            // if we do not, it is set to false
            boolean hasNextInt = scanner.hasNextInt();
            // this hasNextInt should be just before taking input
            if (hasNextInt) {
                int num = scanner.nextInt();
                ans += num;
                count += 1;
                // we increment count only if an integer is entered
            } else {
                System.out.println("Invalid input, please enter an integer");
            }
            scanner.nextLine(); // handle end of line
        } while (count != nos);
        scanner.close();
        return ans;
    }
}

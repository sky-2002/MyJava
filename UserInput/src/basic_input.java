import java.util.Scanner;

public class basic_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if (age >= 10 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }
            else {
                System.out.println("Invalid year of birth.");
            }
        }

        scanner.close();
    }
}

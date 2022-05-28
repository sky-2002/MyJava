public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number<0)
            return -1;
        if (number==number/10)
            return number;
        int f = number%10;
        while (true){
            if (number==number%10)
                return f+number;
            number /= 10;
        }
    }
}

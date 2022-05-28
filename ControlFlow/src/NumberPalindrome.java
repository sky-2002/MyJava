public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse=0;int original = number;
        while (number!=0){
            int last_digit = number%10;
            reverse*=10;
            reverse+=last_digit;
            number = number/10;
        }

        if (reverse==original)
            return true;
        return false;
    }
}

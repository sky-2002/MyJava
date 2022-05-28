public class LastDigitChecker {

    public static boolean isValid(int n){
        return (n<=1000 && n>=10);
    }

    public static boolean hasSameLastDigit(int a,int b,int c){
        if (!(isValid(a)) || !(isValid(b)) || !(isValid(c)))
            return false;
        int la = a%10;
        int lb = b%10;
        int lc = c%10;

        if (la!=lb && lc!=lb && la!=lc)
            return false;
        return true;
    }
}

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number<0)
            return -1;
        int ans = 0;
        while (number!=0){
            if ((number%10)%2==0)
                ans+=number%10;
            number/=10;
        }
        return ans;
    }
}

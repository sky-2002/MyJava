public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first,int second){
        if (first<10 || second<10)
            return -1;
        int min = Math.min(first, second);
        for (int i=min;i>0;i--){
            if (dividesFully(i,first) && dividesFully(i,second))
                return i;
        }
        return min;
    }

    public static boolean dividesFully(int a,int b){
        // this returns true if a divides b fully
        return b % a == 0;
    }
}

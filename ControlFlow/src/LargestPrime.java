public class LargestPrime {

    public static int getLargestPrime(int number){
        if (number<=1)
            return -1;
        int lp=0;
        for (int i=2;i<=number;i++){
            if (number%i==0){
                int flag=0;
                for (int j=2;j<i;j++){
                    if (i%j==0){
                        flag=-1;
                    }
                }
                if (flag!=-1){
                    if (i>=lp)
                        lp=i;
                }
            }
        }
        return lp;
    }
}

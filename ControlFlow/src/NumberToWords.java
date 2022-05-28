public class NumberToWords {

    public static void numberToWords(int number){
        if (number<0)
            System.out.println("Invalid Value");
        else if (number==0)
            System.out.println("Zero");
        else {
            int rev = reverse(number);
            String ans="";
            while (rev!=0){
                int rem = rev%10;
                switch (rem){
                    case 0:
                        ans+="Zero ";
                        break;
                    case 1:
                        ans+="One ";
                        break;
                    case 2:
                        ans+="Two ";
                        break;
                    case 3:
                        ans+="Three ";
                        break;
                    case 4:
                        ans+="Four ";
                        break;
                    case 5:
                        ans+="Five ";
                        break;
                    case 6:
                        ans+="Six ";
                        break;
                    case 7:
                        ans+="Seven ";
                        break;
                    case 8:
                        ans+="Eight ";
                        break;
                    case 9:
                        ans+="Nine ";
                        break;
                }
                rev/=10;
            }
            if (getDigitCount(number)!=getDigitCount(reverse(number))){
                for (int i=1;i<=Math.abs(getDigitCount(number)-getDigitCount(reverse(number)));i++){
                    ans+="Zero ";
                }
            }
            System.out.println(ans);
        }
    }

    public static int reverse(int number){
        int ans=0;
        while (number!=0){
            int r = number%10;
            ans*=10;
            ans+=r;
            number/=10;
        }
        return ans;
    }

    public static int getDigitCount(int number){
        int c=0;
        if (number<0)
            return -1;
        if (number==0)
            return 1;
        while (number!=0){
            c+=1;
            number/=10;
        }
        return c;
    }
}

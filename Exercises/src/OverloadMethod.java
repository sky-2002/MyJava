public class OverloadMethod {

    public static void main(String[] args){
        System.out.println(getScore(5,5));
        System.out.println(getScore(5,"Aakash"));
    }

    public static int getScore(int a,int b){
        return a+b;
    }

    public static String getScore(int a,String b){
        return "Hello "+b+" , your score is "+a;
    }


}

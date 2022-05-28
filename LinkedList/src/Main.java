public class Main {

    public static void main(String[] args){
         Customer c1 = new Customer("Tim",54.96);
         Customer c2;
        System.out.println(c1.getBalance());
         c2 = c1;
         c2.setBalance(12.18);

        System.out.println(c1.getBalance());
    }
}

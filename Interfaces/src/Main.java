public class Main {
    public static void main(String[] args){
        ITelephone skyPhone;

        skyPhone = new DeskPhone(123456);

        skyPhone.powerOn();
        skyPhone.callPhone(123456);
        skyPhone.answer();

        skyPhone = new MobilePhone(24565);
        skyPhone.powerOn();
        skyPhone.callPhone(24565);
        skyPhone.answer();

    }
}

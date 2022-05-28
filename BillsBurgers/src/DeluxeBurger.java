public class DeluxeBurger extends Hamburger{

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public DeluxeBurger() {
        super("Sausage & Bacon", "Deluxe", "White", 14.54);
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }
}

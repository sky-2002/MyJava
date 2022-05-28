public class Main {
    public static void main(String[] args){
          Hamburger hb = new Hamburger("Sausage","Basic","White",3.56);
        double price = hb.itemizeHamburger();
        hb.addHamburgerAddition1("Tomato",0.27);
        hb.addHamburgerAddition2("Lettuce",0.75);
        price = hb.itemizeHamburger();

        HealthyBurger hhb = new HealthyBurger("Becon",5.67);
        hhb.addHamburgerAddition1("Egg",5.43);
        hhb.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total healthy hamburger price is "+hhb.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
    }
}

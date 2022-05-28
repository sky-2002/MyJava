public class Main {
    public static void main(String[] args){
        Car car = new Car(6,"MyCar");
        Mitsubishi mit = new Mitsubishi(4,"MitCar");
        Holden hol = new Holden(5,"HolCar");
        Ford frd = new Ford(6,"FrdCar");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println(mit.startEngine());
        System.out.println(mit.accelerate());
        System.out.println(mit.brake());

        System.out.println(hol.startEngine());
        System.out.println(hol.accelerate());
        System.out.println(hol.brake());

        System.out.println(frd.startEngine());
        System.out.println(frd.accelerate());
        System.out.println(frd.brake());
    }
}

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
//    public Car(){};
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    // constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){return "Car -> startEngine()";}
    public String accelerate(){return "Car -> accelerate()";}
    public String brake(){return "Car -> brake()";}
}

class Mitsubishi extends Car{
     public Mitsubishi(int cylinders, String name){
         super(cylinders,name);
     }

     @Override
     public String startEngine(){return "Mitsubishi -> startEngine()";}

    @Override
    public String accelerate(){return "Mitsubishi -> accelerate()";}

    @Override
    public String brake(){return "Mitsubishi -> brake()";}
}

class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine(){return "Ford -> startEngine()";}

    @Override
    public String accelerate(){return "Ford -> accelerate()";}

    @Override
    public String brake(){return "Ford -> brake()";}
}

class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine(){return "Holden -> startEngine()";}

    @Override
    public String accelerate(){return "Holden -> accelerate()";}

    @Override
    public String brake(){return "Holden -> brake()";}
}
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements ISaveable{

    private  String name;
    private int hintPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hintPoints, int strength) {
        this.name = name;
        this.hintPoints = hintPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHintPoints() {
        return hintPoints;
    }

    public void setHintPoints(int hintPoints) {
        this.hintPoints = hintPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

//    public static ArrayList<String> readValues(){
//        ArrayList<String> values = new ArrayList<~>();
//        Scanner scanner = new Scanner(System.in);
//
//        boolean quit = false;
//        int index = 0;
//        System.out.println("Choose\n"+
//                "1 to enter a string\n"+
//                "0 to quit");
//
//        while (!quit){
//            System.out.println("Choose an option");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice){
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    System.out.println("Enter a string: ");
//                    String stringInput = scanner.nextLine();
//                    values.add(index,stringInput);
//                    index++;
//                    break;
//            }
//        }
//        return values;
//    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hintPoints=" + hintPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.getName());
        values.add(1,""+this.hintPoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.hintPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt((savedValues.get(2)));
            this.weapon = savedValues.get(3);
        }
    }


//    public static void saveObject(ISaveable objectToSave){
//        for(int i=0;i<objectToSave.write().size();i++){
//            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
//        }
//    }
//
//    public static void loadObject(ISaveable objectToLoad){
//        ArrayList<String> values = readValues();
//        objectToLoad.read(values);
//    }
}

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hintPoints;
    private int strength;

    public Monster(String name, int hintPoints, int strength) {
        this.name = name;
        this.hintPoints = hintPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hintPoints=" + hintPoints +
                ", strength=" + strength +
                '}';
    }

    public int getHintPoints() {
        return hintPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.getName());
        values.add(1,""+this.hintPoints);
        values.add(2,""+this.strength);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.hintPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt((savedValues.get(2)));
        }
    }
}

import java.util.ArrayList;

public class arraylist {

    public ArrayList<String> grocery = new ArrayList<>();

    public void addItem(String item){
        grocery.add(item);
        System.out.println(item+" added to grocery.");
    }

    public void showList(){
        System.out.println("You have "+grocery.size()+" items in grocery");
        for (int i = 0;i<grocery.size();i++){
            System.out.println((i+1)+". "+grocery.get(i));
        }
    }

    public void modify(int position,String rep){
        grocery.set(position,rep);
        System.out.println(rep+" has been added to position "+(position+1));
    }

    public void removeItem(int position){
        String item = grocery.get(position);
        grocery.remove(position);
        System.out.println(item+" removed.");
    }
}

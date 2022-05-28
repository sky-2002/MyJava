import java.security.cert.TrustAnchor;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<contact> myContacts;

    public MobilePhone(String mynum){
        this.myNumber = mynum;
        this.myContacts = new ArrayList<contact>();
    }
    public boolean addNewContact(contact c){
        for (int i=0;i<myContacts.size();i++){
            if (myContacts.get(i).getName()==c.getName())
                return false;
        }
        myContacts.add(c);
        return true;
    }
    public boolean updateContact(contact old,contact newc){
        if (myContacts.contains(old)){
            myContacts.set(myContacts.indexOf(old),newc);
            return true;
        }
        return false;
    }
    public boolean removeContact(contact c){
        if (myContacts.contains(c)){
            myContacts.remove(c);
            return true;
        }
        return false;
    }
    private int findContact(contact c){
        return myContacts.indexOf(c);
    }
    private int findContact(String name){
        for (int i=0;i<myContacts.size();i++){
            if (myContacts.get(i).getName()==name)
                findContact(myContacts.get(i));
        }
        return -1;
    }
    public contact queryContact(String name){
        int ind = findContact(name);
        if (ind!=-1)
            return myContacts.get(ind);
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i=0;i<myContacts.size();i++){
            contact cont = myContacts.get(i);
            System.out.println((i+1)+" "+cont.getName()+" -> "+cont.getPhoneNumber());
        }
    }
}

class contact{
    private String name,phoneNumber;

    public contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static contact createContact(String name,String number){
        return new contact(name,number);
    }
}

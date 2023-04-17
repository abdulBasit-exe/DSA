package Array;

public class ContactAppMain {
    public static void main(String[] args) {
        ContactApp ca= new ContactApp();
        ca.display();
        ca.search(ca.numbersArray, 333715970);
        ca.search(ca.namesArray,"basit");
    }
}

package Array;

public class ContactApp{
    int[] numbersArray={333715970,336321883,300981099};
    String[] namesArray= {"basit","muzammil","khaliq"};
    int i,j;
    public void display(){
        System.out.println("\t\t\t\t DISPLAYING CONTACTS\t\t\t\t");

        for (i=0;i<numbersArray.length;i++){
            System.out.print((i+1)+"- ");
            System.out.println(namesArray[i]+" : "+numbersArray[i]);
        }
    }
    public void search(int[] numbersArray,int number) {
        System.out.println("\t\t\t\t SEARCHING \t\t\t\t");
        int targetFoundAt=-1;
        System.out.println("searching contact: "+number);
        for (i = 0; i < numbersArray.length; i++) {
            if (number == numbersArray[i]) {
                targetFoundAt=i;
            }
        }

        if (targetFoundAt>=0) {
            System.out.print("contact name: ");
            System.out.println(namesArray[targetFoundAt]);

        } else System.out.println("not found");
    }

    public void search(String[] namesArray,String name) {
        System.out.println("\t\t\t\t SEARCHING \t\t\t\t");
        int targetFoundAt=-1;
        System.out.println("searching contact: "+name);
        for (i = 0; i < namesArray.length; i++) {
            if (name == namesArray[i]) {
                targetFoundAt=i;
            }
        }

        if (targetFoundAt>=0) {
            System.out.print("contact number: ");
            System.out.print(numbersArray[targetFoundAt]);

        } else System.out.println("not found");
    }
    }
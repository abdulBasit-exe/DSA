package DSA_Lab;

import java.util.ArrayList;

public class MenuBuilder {
    public static void main(String[] args) {

        String menuTitle= "My Dream Menu";
        System.out.println(menuTitle);
        ArrayList<String> menu = new ArrayList<>();
        String starter = "Chicken corn soup";
        menu.add(starter);
        String mainCourse = "Chicken Biryani";
        menu.add(mainCourse);
        String dessert = "brownie";
        menu.add(dessert);
        System.out.println(menu);
    }
}

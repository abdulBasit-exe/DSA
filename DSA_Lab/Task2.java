package DSA_Lab;

import java.util.Scanner;

/*
Task#02Write a java program whichwill take age and display the theatre ticket cost•For adult(age>13) ticket is $10•for
the child(age<13) ticket cost is $5•there is a special discount for senior citizens(age>65)and ticket is $7 for them
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        int ticketPrice=0;

        if (age>13){
            ticketPrice=10;
        }
        if (age<13){
            ticketPrice=5;
        }
        if (age>65){
            ticketPrice=7;
        }

        System.out.println("ticket price is: "+ticketPrice);
    }
}

package DSA_Lab;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Lab1Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfHrsWorkPerWeek = sc.nextByte();
        int amountOfMoneyPerHr = sc.nextByte();

        long grossSalary = amountOfMoneyPerHr * noOfHrsWorkPerWeek * 54;
        System.out.println("salary without bonus: "+grossSalary);


    }
}

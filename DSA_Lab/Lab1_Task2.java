package DSA_Lab;

import java.util.Scanner;

public class Lab1_Task2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String que = "what is the short form of Data Structure and Algorithm?";
        String ans= "DSA";
        String wrongAns = "DBS";
        String wrongAns2 = "DTS";
        String wrongAns3 = "OR";
        System.out.println(que);

        System.out.println(wrongAns3);
        System.out.println(wrongAns);
        System.out.println(ans);
        System.out.println(wrongAns2);

        String input = sc.next();

        if (input.equalsIgnoreCase(ans)) System.out.println("correct answer!");
        else System.out.println("wrong answer!");
    }
}

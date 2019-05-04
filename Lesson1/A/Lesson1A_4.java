package Lesson1.A;

import java.util.Scanner;

public class Lesson1A_4 {
    public static void main(String[] args) {
        String password = "12345";

        equality(password);
    }

    private static void equality(String pass) {
        Scanner scan = new Scanner(System.in);

        if (scan.nextLine().equals(pass)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
            equality(pass);
        }
    }
}

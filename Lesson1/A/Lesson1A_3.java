package Lesson1.A;

import java.util.Random;

public class Lesson1A_3 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.println(random.nextInt(100));
        }

        System.out.println();

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.print(random.nextInt(100) + " ");
        }
    }
}

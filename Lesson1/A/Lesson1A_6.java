package Lesson1.A;

import java.util.Date;

public class Lesson1A_6 {
    public static void main(String[] args) {

        Date data = new Date();

        System.out.println("Tynchenko Vadim " + data);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        data = new Date();

        System.out.println(data);
    }
}

package Lesson1.B;

public class Lesson1B_1 {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Четные: ");
        for (int value : input.getNums()) {
            if ((value % 2) == 0) {
                System.out.print(value + " ");
            }
        }

        System.out.println();

        System.out.print("Не четные: ");
        for (int value :
                input.getNums()) {
            if ((value % 2) != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
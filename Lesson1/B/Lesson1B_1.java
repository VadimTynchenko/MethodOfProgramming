package Lesson1.B;

public class Lesson1B_1 {
    public static void main(String[] args) {
        Input input = new Input();


        System.out.print("Четные: ");
        for (int value : input.getNums()) even(value);

        System.out.println();

        System.out.print("Не четные: ");
        for (int value : input.getNums()) {
            odd(value);
        }
    }

    private static void even(int x) {
        if ((x % 2) == 0) {
            System.out.print(x + " ");
        }
    }

    private static void odd(int x) {
        if ((x % 2) != 0) System.out.print(x + " ");
    }
}

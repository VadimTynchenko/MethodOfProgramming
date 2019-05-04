package Lesson1.B;

public class Lesson1B_3 {
    public static void main(String[] args) {
        Input input = new Input();

        for (int i = 0; i < input.getNums().length; i++) {
            if ((input.getNums()[i] % 3) == 0 || (input.getNums()[i] % 9) == 0) {
                System.out.println(input.getNums()[i]);
            }
        }
    }
}

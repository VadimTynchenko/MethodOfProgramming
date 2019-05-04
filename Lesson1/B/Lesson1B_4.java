package Lesson1.B;

public class Lesson1B_4 {
    public static void main(String[] args) {
        Input input = new Input();

        for (int i = 0; i < input.getNums().length; i++) {
            if ((input.getNums()[i] % 5) == 0
            && (input.getNums()[i] % 7) == 0) System.out.println(input.getNums()[i]);
        }
    }
}

package Lesson1.B;

import java.util.Arrays;

public class Lesson1B_7 {
    public static void main(String[] args) {
        Input input = new Input();

        Arrays.sort(input.getNums());

        try {
            for (int i = 0; i < input.getNums().length - 1; i++) {
                while (input.getNums()[i] != 0 && input.getNums()[i + 1] != 0) {
                    if (input.getNums()[i] > input.getNums()[i + 1]) {
                        input.getNums()[i] = input.getNums()[i] % input.getNums()[i + 1];
                    } else {
                        input.getNums()[i + 1] = input.getNums()[i + 1] % input.getNums()[i];
                    }
                }
            }
            for (int a : input.getNums()) {
                if (a != 0) {
                    System.out.println(a);
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Мало!");
        }
    }
}

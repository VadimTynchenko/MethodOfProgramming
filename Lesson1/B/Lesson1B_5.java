package Lesson1.B;

public class Lesson1B_5 {
    public static void main(String[] args) {
        Input input = new Input();

        for (int i = input.getNums().length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (input.getNums()[j] > input.getNums()[j + 1]) {
                    int a = input.getNums()[j];
                    input.getNums()[j] = input.getNums()[j + 1];
                    input.getNums()[j + 1] = a;
                }
            }
        }

        for (int res :
                input.getNums()) {
            System.out.println(res);
        }
    }
}

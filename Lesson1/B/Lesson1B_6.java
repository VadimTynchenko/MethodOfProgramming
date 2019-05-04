package Lesson1.B;

public class Lesson1B_6 {
    public static void main(String[] args) {
        Input input = new Input();

        for (int i = 0; i < input.getNums().length; i++) {
            if (input.getNums()[i] > 99 && input.getNums()[i] < 1000) {
                method(input.getNums()[i]);
            }
        }
    }

    private static void method(int x) {
        char[] res = Integer.toString(x).toCharArray();
        int count = 0;

        for (int i = res.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (res[j] != res[i]) {
                    count++;
                }
            }
        }

        if (count == res.length) {
            System.out.println(x);
        }
    }
}

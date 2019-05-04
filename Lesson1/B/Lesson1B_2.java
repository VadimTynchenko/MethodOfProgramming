package Lesson1.B;

public class Lesson1B_2 {
    public static void main(String[] args) {
        Input in = new Input();

        int min = in.getNums()[0];
        int max = in.getNums()[0];
        for (int i = 0; i < in.getNums().length - 1; i++) {
            if (in.getNums()[i + 1] > max) max = in.getNums()[i + 1];
            if (in.getNums()[i + 1] < min) min = in.getNums()[i + 1];
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}

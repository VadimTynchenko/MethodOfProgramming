package Lesson1.B;

import java.util.Scanner;

class Input {

    private int[] nums;

    int[] getNums() {
        return nums;
    }

    Input() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
    }
}

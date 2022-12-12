package org.campus02.arrays;

import java.util.Arrays;

public class ArrayHelper {
    public static void main(String[] args) {
        int[] numbers = {8, 5, 1, 9, 0, 4};
        arrangeOrder(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void arrangeOrder(int[] numbers) {
        //Arrays.sort(numbers);
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}

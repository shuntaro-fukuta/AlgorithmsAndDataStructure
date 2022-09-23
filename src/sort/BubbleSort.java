package sort;

import java.util.Arrays;

import algorithms.AlgorithmUtils;

public class BubbleSort {
    public static void main(String[] args) {
        int[] targetNumbers = AlgorithmUtils.createRandomNums(10);
        System.out.println(Arrays.toString(sort(targetNumbers)));
    }

    private static int[] sort(int[] numbers) {
        int startIndex = numbers.length - 1;
        int endIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = startIndex; j > endIndex; j--) {
                int rightNumber = numbers[j];
                int leftNumber = numbers[j - 1];
                if (rightNumber < leftNumber) {
                     AlgorithmUtils.swap(numbers, j, j - 1);
                }
            }
            endIndex++;
        }

        return numbers;
    }
}

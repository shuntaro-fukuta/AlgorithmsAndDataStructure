package algorithms.sort;

import java.util.Arrays;

import algorithms.AlgorithmUtils;

public class BubbleSort {
    public static void main(String[] args) {
        int[] targetNumbers = AlgorithmUtils.createRandomNums(10);
        System.out.println(Arrays.toString(sortFromLeft(targetNumbers)));
        System.out.println(Arrays.toString(sortFromRight(targetNumbers)));
    }

    private static int[] sortFromLeft(int[] numbers) {
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

    private static int[] sortFromRight(int[] numbers) {
        int endIndex = numbers.length - 1;
        for (int i = 0; i < endIndex; i++) {
            for (int j = 0; j > endIndex; j++) {
                int left = numbers[j];
                int right = numbers[j+1];
                if (left > right) {
                    AlgorithmUtils.swap(numbers, left, right);
                }
            }
            endIndex--;
        }

        return numbers;
    }
}

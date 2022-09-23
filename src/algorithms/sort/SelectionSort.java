package algorithms.sort;

import java.util.Arrays;

import algorithms.AlgorithmUtils;

public class SelectionSort {

    public static void main(String[] arge) {
        int[] targetNumbers = AlgorithmUtils.createRandomNums(10);
        System.out.println(Arrays.toString(sort(targetNumbers)));
    }

    private static int[] sort(int[] numbers) {
        int endIndex = numbers.length;
        for (int i = 0; i < endIndex; i++) {
            int minNumIndex = i;
            for (int j = i + 1; j < endIndex; j++) {
                if (numbers[j] < numbers[minNumIndex]) {
                    minNumIndex = j;
                }
            }

            if (minNumIndex != i) {
                AlgorithmUtils.swap(numbers, i, minNumIndex);
            }
        }

        return numbers;
    }

}

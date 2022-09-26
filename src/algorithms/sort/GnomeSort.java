package algorithms.sort;

import java.util.Arrays;

import algorithms.AlgorithmUtils;

public class GnomeSort {

    public static void main(String[] args) {
        int[] targetNumbers = AlgorithmUtils.createRandomNums(10);
        System.out.println(Arrays.toString(sort(targetNumbers)));
    }

    private static int[] sort(int[] numbers) {
        int numbers_count = numbers.length;
        int index = 0;
        while (index < numbers_count) {
            if (index == 0) index ++;

            if (numbers[index] >= numbers[index-1]) {
                index++;
            } else {
                AlgorithmUtils.swap(numbers, index, index-1);
                index--;
            }
        }

        return numbers;
    }

}

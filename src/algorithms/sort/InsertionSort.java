package algorithms.sort;

import java.util.Arrays;

import algorithms.AlgorithmUtils;

public class InsertionSort {

    public static void main(String[] args) {
        int[] targetNumbers = AlgorithmUtils.createRandomNums(10);
        System.out.println(Arrays.toString(sort(targetNumbers)));
    }

    private static int[] sort(int[] numbers) {
        for(int i = 1; i < numbers.length; i++){
            int tmp = numbers[i];
            int j = i;
            while(j > 0 && tmp < numbers[j - 1]){
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = tmp;
        }

        return numbers;
    }

}

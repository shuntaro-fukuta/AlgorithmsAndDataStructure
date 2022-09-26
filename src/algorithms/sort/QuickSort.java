package algorithms.sort;

import java.util.Arrays;

import algorithms.AlgorithmUtils;

public class QuickSort {

    public static void main(String[] args){
        int[] targetNumbers = AlgorithmUtils.createRandomNums(10);
        sort(targetNumbers, 0, targetNumbers.length-1);
        System.out.println(Arrays.toString(targetNumbers));
    }

    private static void sort(int[] numbers, int beginIndex, int endIndex) {
        if (beginIndex < endIndex) {
            int partitionIndex = partition(numbers, beginIndex, endIndex);

            sort(numbers, beginIndex, partitionIndex-1);
            sort(numbers, partitionIndex+1, endIndex);
        }
    }

    private static int partition(int numbers[], int beginIndex, int endIndex) {
        int pivot = numbers[endIndex];
        int i = (beginIndex-1);

        for (int j = beginIndex; j < endIndex; j++) {
            if (numbers[j]<= pivot) {
                i++;
                AlgorithmUtils.swap(numbers, i, j);
            }
        }

        int partitionIndex = i + 1;
        AlgorithmUtils.swap(numbers, i+1, endIndex);

        return partitionIndex;
    }

}

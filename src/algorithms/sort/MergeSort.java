package algorithms.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] targetNumbers = { 5, 4, 1, 8, 7, 3, 2, 9 };
        sort(targetNumbers);
        System.out.println(Arrays.toString(targetNumbers));

    }

    private static int[] sort(int[] numbers) {
        System.out.println("numbers: " + Arrays.toString(numbers) + "\n");
        if (numbers.length <= 1) return numbers;

        int center = numbers.length / 2;
        int[] left = Arrays.copyOfRange(numbers, 0, center);
        int[] right = Arrays.copyOfRange(numbers, center, numbers.length);

        System.out.println("left called: sort(" + Arrays.toString(left) + ")");
        sort(left);
        System.out.println("right called: sort(" + Arrays.toString(right) + ")");
        sort(right);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                numbers[k] = left[i];
                i++;
            } else {
                numbers[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            numbers[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            numbers[k] = right[j];
            j++;
            k++;
        }

        System.out.println("merged!!: " + Arrays.toString(numbers) + "\n");
        return numbers;
    }
}

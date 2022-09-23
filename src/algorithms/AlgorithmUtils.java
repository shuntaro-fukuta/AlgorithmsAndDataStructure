package algorithms;

import java.util.Random;

public class AlgorithmUtils {

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static int[] createRandomNums(int length) {
      Random random = new Random();
      int[] nums = new int[length];
      for (int i = 0; i < nums.length; i++) {
         nums[i] = random.nextInt(1000);
      }

      return nums;
    }

}

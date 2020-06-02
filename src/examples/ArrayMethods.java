package examples;

import java.util.Random;

public class ArrayMethods {

    public static int[] getArrayByType(int[] nums, boolean positive) {
        int[] result = new int[countValuesByType(nums, positive)];
        int index = 0;

        if (positive)
            for (int n: nums) {
                if (n >= 0) result[index++] = n;
            }

        else
            for (int n : nums) {
                if (n < 0) result[index++] = n;
            }

        return result;
    }

    public static int countValuesByType(int[] nums, boolean positive) {
        int result = 0;

        if (positive)
            for (int n: nums) {
                if (n >= 0) result++;
            }
        else
            for (int n: nums) {
                if (n < 0) result++;
            }
        return result;
    }

    public static float[] randomFloatsArray(int length, float min, float max) {
        float[] array = new float[length];

        for (int i = 0; i < array.length ; i++) {
            array[i] = min + new Random().nextFloat() * (max - min);
        }
        return array;
    }

    public static float min(float[] nums) {
        float min = nums[0];

        for (float f: nums) {
            if (f < min) min = f;
        }

        return min;
    }

    public static int min(int[] nums) {
        int min = nums[0];

        for (int n: nums) {
            if (n < min) min = n;
        }

        return min;
    }

    public static float max(float[] nums) {
        float max = nums[0];

        for (float f: nums) {
            if (f > max) max = f;
        }

        return max;
    }

    public static int max(int[] nums) {
        int max = nums[0];

        for (int n: nums) {
            if (n > max) max = n;
        }

        return max;
    }

    public static float sumOfValues(float[] array) {
        float result = 0;

        for (float f: array) {
            result += f;
        }

        return result;
    }

    public static float avgValue(float[] array) {
        return sumOfValues(array) / array.length;
    }

    public static float[] indexToInsert(float[] array, float value, int index) {

        if (index >= 0 && index <= array.length) {
            float[] result = new float[array.length + 1];
            result[index] = value;

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) result[i] = array[j++];
            }
            return result;
        } else
            System.err.println("INDEX OUT OF BOUNDS");

        return array;
    }

    public static int[] sortArray(int[] nums) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static int[] indexToDelete(int[] nums, int index) {

        if (index >= 0 && index < nums.length) {
            int[] result = new int[nums.length - 1];

            for (int i = 0, j = 0; i < nums.length; i++) {
                if (i != index) result[j++] = nums[i];
            }
            return result;
        } else
            System.err.println("NO SUCH INDEX IN THIS ARRAY!");

        return nums;
    }

    public static float[] indexToDelete(float[] nums, int index) {

        if (index >= 0 && index < nums.length) {
            float[] result = new float[nums.length - 1];

            for (int i = 0, j = 0; i < nums.length; i++) {
                if (i != index) result[j++] = nums[i];

            }
            return result;
        } else
            System.err.println("NO SUCH INDEX IN THIS ARRAY!");

        return nums;
    }

    public static int firstEnterIndex(int[] nums, int value) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) return i;
        }
        System.err.println("NO SUCH VALUE IN THE ARRAY!");
        return -1;
    }
}

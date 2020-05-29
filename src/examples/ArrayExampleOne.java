package examples;

import static examples.ArrayMethods.*;

public class ArrayExampleOne {
    final static int NUMBER = 2;

    public static void run() {
        System.out.println("EXAMPLE " + NUMBER + " START\n");

        int[] nums = {50, -10, 40, -30, 20};
        int[] negativeNums = getArrayByType(nums, false);
        int[] positiveNums = getArrayByType(nums, true);
        negativeNums = sortArray(negativeNums);
        positiveNums = sortArray(positiveNums);

        System.out.println("POSITIVE VALUES:");
        for (int n : positiveNums) {
            System.out.println(n);
        }
        System.out.println("\nNEGATIVE VALUES:");
        for (int n : negativeNums) {
            System.out.println(n);
        }

        System.out.println("\nEXAMPLE " + NUMBER + " END");
    }


}


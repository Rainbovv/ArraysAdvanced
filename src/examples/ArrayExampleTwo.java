package examples;

import static examples.ArrayMethods.*;

public class ArrayExampleTwo {

    final static int NUMBER = 2;

    public static void run(){
        System.out.println("EXAMPLE " + NUMBER + " START\n");

        String[] weekDays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        float[] weekTemperature = randomFloatsArray(7,-20,20);
        weekTemperature = indexToDelete(weekTemperature, 4);
        weekTemperature = indexToInsert(weekTemperature, 5.7f, 4);

        for (int i = 0; i < weekTemperature.length; i++) {

            System.out.printf("%s:%9.1f%n",weekDays[i], weekTemperature[i]);
        }

        System.out.printf("%nMIN TEMPERATURE: %5.1f%n", min(weekTemperature));
        System.out.printf("MAX TEMPERATURE: %5.1f%n", max(weekTemperature));
        System.out.printf("AVG TEMPERATURE: %5.1f%n", avgValue(weekTemperature));


        System.out.println("\nEXAMPLE " + NUMBER + " END");
    }
}

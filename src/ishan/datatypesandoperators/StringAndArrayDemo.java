package ishan.datatypesandoperators;

import java.util.Arrays;

public class StringAndArrayDemo {

    public static void run() {
        String a = "Hello";
        String b = "World";

        System.out.println(a + " " + b);

        int[] nums = {10, 20, 30};
        System.out.println("Array: " + Arrays.toString(nums));

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("Sum: " + sum);
    }
}

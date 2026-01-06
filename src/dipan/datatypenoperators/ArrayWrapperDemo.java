package dipan.datatypenoperators;

import java.util.Arrays;

public class ArrayWrapperDemo {
    static void arrayWrapperDemo() {
        int[] nums = {1, 2, 3};
        Integer wrapper = Integer.valueOf(10);

        System.out.println("\n-- Arrays & Wrapper Demo --");
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Wrapper value: " + wrapper);
        System.out.println("Auto-unboxed + 5: " + (wrapper + 5));
    }
}

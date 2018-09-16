package ru.atom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * In this assignment you need to implement the following util methods.
 * Note:
 *  throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {



    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {
        // converting int[] to Integer[] --- VARIANT 1
        Integer[] val = new Integer[values.length];
        for (int i = 0; i < values.length; i++) {
            val[i] = Integer.valueOf(values[i]);
        }

        int max = Collections.max(Arrays.asList(val));
        return max;

        // converting int[] to Integer[] --- VARIANT 2
        //Integer[] val = Arrays.stream(values).boxed().toArray(Integer[]::new);
        // converting int[] to Integer[] --- VARIANT 3
        //List<Integer> val = IntStream.of(values).boxed().collect(Collectors.toList());
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        long sum = 0;
        for (long i : values) {
            sum += i;
        }
        return sum;
    }

}

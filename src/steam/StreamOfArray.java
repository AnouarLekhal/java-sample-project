package steam;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfArray {
    public static void main(String[] args) {

        //Object Array
        Integer[] array1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Primitive Array
        int array2[] = { 1, 2, 3, 4, 5 };

        // Using Arrays.stream(array)
        Stream<Integer> stream1 = Arrays.stream(array1);
        stream1.forEach(System.out::println);

        System.out.println("============");

        // --------- Using Stream.of() ---------
        // Rq : Stream.of() method simply calls the Arrays.stream() method for non-primitive types.
        Stream<Integer> stream2 = Stream.of(array1);
        stream2.forEach(System.out::println);

        System.out.println("============");

        //Difference between Arrays.stream() and Stream.of()
        IntStream stream3 = Arrays.stream(array2);
        stream3.forEach(System.out::println);

        System.out.println("============");

        // --------- Using Stream.of() ---------
        //Not working
        Stream<int[]> stream4 = Stream.of(array2);
        stream4.forEach(System.out::println);
        //Needs flattening
        Stream<int[]> stream5 = Stream.of(array2);
        IntStream stream6 = stream5.flatMapToInt(Arrays::stream);
        stream6.forEach(System.out::println);
    }
}

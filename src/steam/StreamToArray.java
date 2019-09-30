package steam;

import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer[] array = stream.toArray(Integer[]::new);
        for(int i = 0; i < array.length; i++)
        System.out.println(array[i]);
    }
}

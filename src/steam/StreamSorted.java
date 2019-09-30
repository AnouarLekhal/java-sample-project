package steam;

import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(9, 3, 8, 6, 1, 4, 2, 7, 5).sorted();
        stream.forEach(System.out::println);
    }
}

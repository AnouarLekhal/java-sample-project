package steam;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(x -> x%2==0);
        stream.forEach(System.out::println);
    }
}

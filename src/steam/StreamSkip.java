package steam;

import java.util.stream.Stream;

public class StreamSkip {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).skip(2);
        stream.forEach(System.out::println);
    }
}

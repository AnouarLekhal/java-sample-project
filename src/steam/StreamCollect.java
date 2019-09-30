package steam;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {

        Stream.of("a1", "a2", "a3", "a4", "a5", "a6")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);

        IntStream.range(1, 6)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }
}

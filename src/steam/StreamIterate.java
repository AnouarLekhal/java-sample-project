package steam;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1)
                .limit(9).forEach(System.out::println);

        Stream.iterate(1, n -> n <= 9 , n -> n + 1)
                .forEach(x -> System.out.println(x));
    }
}

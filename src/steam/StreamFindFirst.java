package steam;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindFirst {
    public static void main(String[] args) {

        Optional<Integer> result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(x -> x%2==0).findFirst();
        result.ifPresent(System.out::println);
    }
}

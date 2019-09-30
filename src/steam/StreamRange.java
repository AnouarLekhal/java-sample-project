package steam;

import java.util.stream.IntStream;

public class StreamRange {
    public static void main(String[] args) {

        IntStream stream = IntStream.range(4, 9);
        stream.forEach(System.out::println);
    }
}

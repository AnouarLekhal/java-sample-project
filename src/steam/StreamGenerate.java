package steam;

import java.util.Date;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {

        Stream<Date> stream = Stream.generate(() -> new Date()).limit(10);
        stream.forEach(System.out::println);
    }
}

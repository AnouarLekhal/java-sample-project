package steam;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("red")
                .add("blue")
                .add("green")
                .add("white")
                .add("black").build();

        stream.forEach(System.out::println);
    }
}

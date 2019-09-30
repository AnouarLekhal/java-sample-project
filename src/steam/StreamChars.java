package steam;

import java.util.stream.IntStream;

public class StreamChars {

    public static void main(String[] args) {

        IntStream stream = "password123456".chars();
        stream.mapToObj(x -> (char)x).forEach(System.out::println);
    }
}

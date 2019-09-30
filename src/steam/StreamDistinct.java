package steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDistinct {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
        Stream stream = list.stream().distinct();
        stream.forEach(System.out::println);
    }
}

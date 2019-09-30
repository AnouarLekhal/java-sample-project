package steam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
}

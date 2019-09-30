package steam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxed {

    public static void main(String[] args) {

        //It works well
        //List<String> strings = Stream.of("A", "B", "C", "D").collect(Collectors.toList());

        //Compilation Error !!
        //List<Integer> ints = IntStream.of(1,2,3,4,5).collect(Collectors.toList());

        //Get the collection and later it convert to stream to process elements
        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ints);

        //Stream operations directly
        Optional<Integer> max = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .max(Integer::compareTo);

        max.ifPresent(System.out::println);
    }
}

package steam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PrarallelStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("white");
        list.add("black");

        Stream stream = list.parallelStream();
        Optional<String> result = stream.reduce((s1, s2) -> s1 + "-" + s2);
        result.ifPresent(System.out::println);
    }
}

package steam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {

        //The reduce method is used to reduce the elements of a stream to a single value.
        //It takes a BinaryOperator as a parameter.
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("bleu");
        list.add("green");
        list.add("white");
        list.add("black");

        Optional<String> result = list.stream().reduce((s1, s2) -> s1 + "-" + s2);
        result.ifPresent(System.out::println);
    }
}

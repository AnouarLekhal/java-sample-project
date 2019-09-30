package steam;

import java.util.ArrayList;
import java.util.List;

public class StreamMatch {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("bleu");
        list.add("green");
        list.add("white");

        boolean matchedResult;

        //all matched
        matchedResult = list.stream().allMatch((s) -> s.contains("e"));
        System.out.println(matchedResult);

        matchedResult = list.stream().allMatch((s) -> s.contains("a"));
        System.out.println(matchedResult);

        //any matched
        matchedResult = list.stream().anyMatch((s) -> s.contains("b"));
        System.out.println(matchedResult);

        matchedResult = list.stream().anyMatch((s) -> s.contains("a"));
        System.out.println(matchedResult);

        //none matched
        matchedResult = list.stream().noneMatch((s) -> s.contains("a"));
        System.out.println(matchedResult);

        matchedResult = list.stream().noneMatch((s) -> s.contains("e"));
        System.out.println(matchedResult);
    }
}

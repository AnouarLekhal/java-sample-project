package steam;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("white");
        list.add("black");

        Long count = list.stream().filter(x -> x.startsWith("b")).count();
        System.out.println(count);
    }
}

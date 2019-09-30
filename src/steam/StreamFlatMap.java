package steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlatMap {

    public static void main(String[] args) {

        /* Convert Objects
        Stream.flatMap() helps in converting Collection<Collection<T>> to Collection<T>

        <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)

        Examples
        Stream< String[] >		    ->flatMap -> Stream < String >
        Stream < Set < String >>	->flatMap -> Stream < String >
        Stream < List < String >>	->flatMap -> Stream < String >
        Stream < List < Object >>	->flatMap -> Stream < Object >*/

        //Convert Array
        //{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
        String[][] stringArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> arrayStreamTemp = Arrays.stream(stringArray);

        //Stream<String>
        Stream<String> arrayStream = arrayStreamTemp.flatMap(x -> Arrays.stream(x));
        arrayStream.forEach(System.out::println);

        System.out.println("============");

        //Convert List
        //{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
        List<String> list1 = Arrays.asList(new String[]{"a", "b"});
        List<String> list2 = Arrays.asList(new String[]{"c", "d"});
        List<String> list3 = Arrays.asList(new String[]{"e", "f"});

        List<List<String>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        //1. Stream<List<String>>
        Stream<List<String>> listStreamTemp = lists.stream();

        //2. Stream<List<String>> -> flatMap -> Stream
        Stream listStream = listStreamTemp.flatMap(x -> x.stream());
        listStream.forEach(System.out::println);

        System.out.println("============");

        /* Convert primitives

        IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
        LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
        DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)

        Examples
        Stream< int[] >		        ->flatMapToInt -> IntStream
        Stream< long[] >		    ->flatMapToLong -> LongIntStream
        Stream< double[] >		    ->flatMapToDouble -> DoubleIntStream
        */

        //Convert int
        int[] intArray = {1, 2, 3, 4, 5, 6};

        //1. Stream<int[]>
        Stream<int[]> streamIntArray = Stream.of(intArray);

        //2. Stream<int[]> -> flatMap -> IntStream
        IntStream intStream = streamIntArray.flatMapToInt(x -> Arrays.stream(x));
        intStream.forEach(System.out::println);

        System.out.println("============");

        IntStream ints = IntStream.of(intArray);
        ints.forEach(System.out::println);

        System.out.println("============");

        //use boxed
        Stream<Integer> intStream2 = IntStream.of(intArray)
                .boxed().filter(x -> x%2==0);

        intStream2.forEach(System.out::println);

        System.out.println("============");

        int[][] intArray2 = {{1, 2}, {5, 6}, {3, 4}};

        Stream<int[]> intArrayStreamTemp = Arrays.stream(intArray2);
        IntStream intListStream = intArrayStreamTemp.flatMapToInt(x -> Arrays.stream(x));
        intListStream.forEach(System.out::println);

    }
}

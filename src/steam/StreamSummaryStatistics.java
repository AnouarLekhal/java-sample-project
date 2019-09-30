package steam;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamSummaryStatistics {
    public static void main(String[] args) {

        //int
        IntStream stream1 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        IntSummaryStatistics intSummaryStatistics = stream1.summaryStatistics();
        System.out.println(intSummaryStatistics);

        //long
        LongStream stream2 = LongStream.of(1L, 2L, 3L, 4L, 5L, 6L, 7L);
        LongSummaryStatistics longSummaryStatistics = stream2.summaryStatistics();
        System.out.println(longSummaryStatistics);

        //double
        DoubleStream stream3 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
        DoubleSummaryStatistics doubleSummaryStatistics = stream3.summaryStatistics();
        System.out.println(doubleSummaryStatistics);

    }
}

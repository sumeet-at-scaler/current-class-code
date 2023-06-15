package FairWork.Lect_Begin_Streams.DemoOnStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// a wrapper
// on data source -> arr, list, map, files, [console, ports]
// for operations on data coming through those data sources
public class HowToCreateStreams {
    public static void main(String[] args) {
        // array to stream
        Integer[] arr = {10, 20, 30, 40, 50};
        Stream<Integer> s1 = Stream.of(arr);

        // items to stream
        Stream<Integer> s2 = Stream.of(10, 20, 30, 40, 50);

        // list/collections to stream
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> s3 = list.stream();

        // use builder to create a stream
        Stream.Builder<Integer> sb = Stream.builder();
        sb.accept(10);
        sb.accept(20);
        sb.accept(30);
        sb.accept(40);
        sb.accept(50);
        Stream<Integer> s4 = sb.build();
    }
}

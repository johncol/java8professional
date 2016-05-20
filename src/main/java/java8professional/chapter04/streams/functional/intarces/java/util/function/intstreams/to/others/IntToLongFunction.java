package java8professional.chapter04.streams.functional.intarces.java.util.function.intstreams.to.others;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

@FunctionalInterface
public interface IntToLongFunction {

    Long apply(Integer value);

    public static void main(String[] args) {
        LongStream stream = IntStream.of(1, 2, 3).mapToLong(x -> x * 100000000000L);
        stream.forEach(System.out::println);
    }

}

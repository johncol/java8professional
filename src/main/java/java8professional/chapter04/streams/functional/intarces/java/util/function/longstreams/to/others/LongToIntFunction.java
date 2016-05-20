package java8professional.chapter04.streams.functional.intarces.java.util.function.longstreams.to.others;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

@FunctionalInterface
public interface LongToIntFunction {

    Integer apply(Long value);

    public static void main(String[] args) {
        IntStream stream = LongStream.of(1, 2, 3).mapToInt(x -> (int) x);
        stream.forEach(System.out::println);
    }
}

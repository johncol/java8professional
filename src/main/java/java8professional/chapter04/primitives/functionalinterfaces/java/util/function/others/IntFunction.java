package java8professional.chapter04.primitives.functionalinterfaces.java.util.function.others;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
public interface IntFunction<Y> {

    Y apply(Integer value);

    public static void main(String[] args) {
        Stream<OptionalInt> stream = IntStream.of(1, 2, 3).mapToObj(OptionalInt::of);
        stream.forEach(System.out::println);
    }

}

package java8professional.chapter04.primitives.functionalinterfaces.java.util.function.others;

import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
public interface ToIntFunction<X> {

    Integer apply(X x);

    public static void main(String[] args) {
        IntStream stream = Stream.of(1, 2, 3).mapToInt(x -> x + 1);
        stream.forEach(System.out::println);
    }

}

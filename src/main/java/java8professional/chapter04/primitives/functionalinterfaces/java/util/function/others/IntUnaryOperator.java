package java8professional.chapter04.primitives.functionalinterfaces.java.util.function.others;

import java.util.stream.IntStream;

@FunctionalInterface
public interface IntUnaryOperator {

    Integer apply(Integer value);

    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3).map(x -> x * 10);
        stream.forEach(System.out::println);
    }

}

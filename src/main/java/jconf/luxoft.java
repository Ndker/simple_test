package jconf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Quiz6 {
    public static void _main(String[] args) {
        try(Resource r = new Resource()) {
            System.out.print("1");
            throw new RuntimeException();
        }
    }
}

class Resource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("closed");
    }
}

class Quiz7 {
    public static void _main(String... args) {
        Map <String, Integer> tmap = new TreeMap<>();
        tmap.put("ab", 1);
        tmap.put("abc", 2);
        tmap.put("abcd", 3);
        tmap.replaceAll((k,v) -> (int)k.charAt(v));
        System.out.print(tmap.values());
        System.out.print(tmap.keySet());
        System.out.print((int)"abc".charAt(0));
    }
}


class Quiz8 {
    public static void _main(String... args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Stream<Integer> ints = list.stream().map(s -> {
           System.out.println(s); // just ignore this?
           return Integer.parseInt(s);
        });
        System.out.print("Count");
        System.out.print(ints.count());
    }
}

class Quiz9 {
    public static void _main(String... args) {
        IntStream stream = IntStream.of(1,2,3,4);
        // peek - look, but dont touch.
        System.out.print(stream.peek((x)->++x).sum());
    }
}

class Quiz10 {
    public static void main(String... args) {
        Function<Double, Double> mul = d -> d*2;
        Function<Double, Integer> f = Double::intValue;
        Function<Double, Integer> func = f.compose(mul);
        System.out.println(func.apply(12.6));

        // While the compose function executes the caller last and the parameter first,
        // the andThen executes the caller first and the parameter last.

        // func = f.andThen(mul); // that's why exception = cannot be applied to given types;
        // System.out.println(func.apply(12.6));
    }
}
package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberRepeat {
    public static void main(String[] args) {
        List.of(12,35,37,45,23,97,56,12)
                .stream()
                .collect(Collectors.groupingBy(num-> num, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue()> 1)
                .map(Map.Entry::getKey )
                .forEach(System.out::println);
    }
}

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        calculateList("make love not war");
    }

    public static void calculateList(String source) {
        Arrays.stream(source.split(" "))
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
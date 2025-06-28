import java.util.*;

public class LambdaExp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Amit", "John", "Ananya");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);
    }
}

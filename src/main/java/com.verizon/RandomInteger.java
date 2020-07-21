import java.util.HashSet;
import java.util.Set;

public class RandomInteger {

    public static void generateRandomNumbers (int n) {

        //Use set to achieve uniqueness
        Set<Integer> numbers = new HashSet<>();

        //Check size to make sure we have no gap
        while (numbers.size() != n) {
            int number = (int) (Math.random() * n + 1);
            numbers.add(number);
        }
        numbers.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        generateRandomNumbers(100);
    }

}

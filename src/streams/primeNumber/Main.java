package streams.primeNumber;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 5, 8, 11, 14, 17, 20, 23, 29, 31, 6, 41, 43, 47, 10, 59, 61, 15, 71, 73, 28, 83, 80, 97);
        List<Integer> primes = numbers.stream().filter(PrimeChecker::checker).toList();
        primes.forEach(System.out::println);
    }
}

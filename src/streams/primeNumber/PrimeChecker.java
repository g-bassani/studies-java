package streams.primeNumber;

public class PrimeChecker {

    public static boolean checker(int num) {
        if (num == 1 || num < 0) {
            return false;
        }

        if (num != 2 && num % 2 == 0) {
            return false;
        }

        int divisionTimes = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisionTimes += 1;
            }
        }

        if (divisionTimes == 2) {
            return true;
        }
        return false;
    }
}

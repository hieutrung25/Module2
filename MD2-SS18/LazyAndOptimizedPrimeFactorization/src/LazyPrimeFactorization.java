public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i))
                System.out.println("Lazy Thread" + i);
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        else
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return false;
            }
        return true;
    }
}

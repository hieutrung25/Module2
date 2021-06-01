public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyObj = new LazyPrimeFactorization();
        Thread lazyThread = new Thread(lazyObj);
        OptimizedPrimeFactorization optimizedObj = new OptimizedPrimeFactorization();
        Thread optimizedThread = new Thread(optimizedObj);
        lazyThread.start();
        optimizedThread.start();
    }
}

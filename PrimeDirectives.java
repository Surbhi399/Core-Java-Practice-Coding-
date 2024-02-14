import java.util.ArrayList;

class PrimeDirectives {
  
  public boolean isPrime(int number) {
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }
    
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    
    return true;
  }
  
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<>();
    for (int num : numbers) {
      if (isPrime(num)) {
        primes.add(num);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {
    PrimeDirectives pd = new PrimeDirectives();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89, 1001};
    ArrayList<Integer> primeNumbers = pd.onlyPrimes(numbers);
    System.out.println("Prime numbers: " + primeNumbers);
  }
}

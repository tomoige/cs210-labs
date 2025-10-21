/**
 * A Java implementation of the Sieve of Eratosthenes algorithm.
 * This program finds all prime numbers up to a given number n.
 */
import java.util.Arrays;

public class sieve {

    /*
     * Main method to demonstrate the Sieve of Eratosthenes.
     */

    public static int counter=0;

    public static boolean[] sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize all entries it as true.
        // A value in prime[i] will finally be false if i is Not a prime, else true.
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        // Start from 2, as 0 and 1 are not prime numbers.
        // We should test all the number from up to the limit n, but it is enough to stop when p <= sqrt(n) (or p*p <=n). 
        // Indeed, it can be proven mathematically that if a number is not prime, it must have a fator that it is less than its square root,
        // therefore we need just to test the number p from 2 to sqrt(n).
        for (int p = 2; p<= Math.sqrt(n); p++) {
            
            // If prime[p] is still true, then it is a prime.
            if (prime[p]) {
                // Update all multiples of p as not prime.
                // The loop starts from p*p because smaller multiples of p
                // (like 2*p, 3*p, etc.) would have already been marked by
                // smaller prime numbers.
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                    counter++;
                }
            }
        }

        System.out.print(counter);
        return prime;
    }

    public static void goldback(int n){
        boolean[] isPrime = sieveOfEratosthenes(n);
        for(int i=3; i <= n; i++){
            for(int j=3; j<=n; j++){
                if(isPrime[i] && isPrime[j] && i+j==n){
                    System.out.println(n + " = " + i + " + " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        
        // int limit = 100; // Find prime numbers up to the value of the "limit" variable.
        System.out.println("Visit https://www.desmos.com/calculator/mhq4hsncnh and copy paste the output valus");
        for(int limit = 50; limit <= 1000; limit+=50){
            counter = 0;
            System.out.print("(" + limit + ",");
            boolean[] isPrime = sieveOfEratosthenes(limit);  //isPrima is an array of boolean, isPrime[n] = true if number n is prime
            System.out.println(")");
            // System.out.println("Primes up to " + limit + ":");
                for (int i = 2; i <= limit; i++) {
                    if (isPrime[i]) {
                        // System.out.print(i + " ");
                    }
                }
        }

        goldback(100);
    }
}
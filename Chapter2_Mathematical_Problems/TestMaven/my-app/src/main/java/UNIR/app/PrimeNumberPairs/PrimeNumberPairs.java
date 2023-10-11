package UNIR.app.PrimeNumberPairs;

import UNIR.app.PrimeNumbers.PrimeNumbers;
import java.util.ArrayList;
/*
* 2.2.5 Exercise 5: Prime Number Pairs (★★✩✩✩)
Compute all pairs of prime numbers with a distance of 2 (twin), 4 (cousin), and 6 (sexy)
up to an upper bound for n. For twins then the following is true:
isPrime(n) && isPrime(n+2)
* */
public class PrimeNumberPairs {

    // Defining the attributes
    private ArrayList<Integer> twinPrimes;
    private ArrayList<Integer> cousinPrimes;
    private ArrayList<Integer> sexyPrimes;

    private ResultPrimes resultPrimes; // This is the object that will be returned by the method PrimeNumberPairs


    // Defining the constructor and initializing the attributes
    public PrimeNumberPairs() {

        this.twinPrimes = new ArrayList<>();
        this.cousinPrimes = new ArrayList<>();
        this.sexyPrimes = new ArrayList<>();

        this.resultPrimes = new ResultPrimes(this.twinPrimes, this.cousinPrimes, this.sexyPrimes);
    }

    /**
     * This method will make use of the method calcPrimesUpTo from the class PrimeNumbers to get a list of the prime numbers up to a number
     * given by the user. Then, it will compare the prime numbers in the list to see if they are twins (n+2), cousins (n+4)  or sexy (n+6).
     * */
    public ResultPrimes findPairCousinSexyPrimes(int num_){
        // We first create an instance of the class PrimeNumbers
        PrimeNumbers primeNumbersList = new PrimeNumbers();
        // We define an ArrayList to store the list of primes
        ArrayList<Integer> primeNumbers = primeNumbersList.calcPrimesUpTo(num_);

        // Now that we have a list of primes up to n, we iterate through the list to find the pairs, cousins, and sexy primes,
        // and store them in their respective lists
        while (primeNumbers.size() > 0){
            // We get the first number from our prime list, we'll use it to compare it with the rest of the numbers in the list
            int primeNum = primeNumbers.get(0);
            if (primeNumbers.contains(primeNum +2)){
                // We add the twin primes to the list of twin primes
                this.twinPrimes.add(primeNum);
                this.twinPrimes.add(primeNum + 2);
            }
            // We repeat this operation for prime cousins and sexy primes
            if (primeNumbers.contains(primeNum + 4)){
                this.cousinPrimes.add(primeNum);
                this.cousinPrimes.add(primeNum + 4);
            }
            if (primeNumbers.contains(primeNum + 6)){
                this.sexyPrimes.add(primeNum);
                this.sexyPrimes.add(primeNum + 6);
            }
            // We remove the number from the list of prime numbers
            primeNumbers.remove(0);
        }
        // Using our setters for the ResultPrimes object.
        this.resultPrimes.setTwinPrimes(this.twinPrimes);
        this.resultPrimes.setCousinPrimes(this.cousinPrimes);
        this.resultPrimes.setSexyPrimes(this.sexyPrimes);

        // We return the object.
        return this.resultPrimes;
    }
}

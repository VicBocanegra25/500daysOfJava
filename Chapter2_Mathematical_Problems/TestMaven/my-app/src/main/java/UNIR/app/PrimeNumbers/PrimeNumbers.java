package UNIR.app.PrimeNumbers;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumbers {

    public PrimeNumbers() {
    }

    public ArrayList< Integer > calcPrimesUpTo(int num_) {
        ArrayList< Integer > numbers = new ArrayList<>();
        ArrayList< Integer > primeNumbers = new ArrayList<>();

        // Populate the list first.
        for (int i = 2; i <= num_; i++) {
            numbers.add(i);
        }

        // Initialize the iterator after populating the list.
        Iterator< Integer > iterator = numbers.iterator();

        // Loop through the numbers using the iterator.
        while (iterator.hasNext()) {
            int number = iterator.next();

            // We consider the first number in our remaining list to be prime.
            primeNumbers.add(number);

            // Remove all multiples of the prime number from our list.
            iterator.remove();  // Remove the current number itself to avoid checking its multiples

            // Remove multiples
            numbers.removeIf(n -> n % number == 0);

            // Re-initialize iterator after list modification to prevent ConcurrentModificationException
            iterator = numbers.iterator();
        }
        return primeNumbers;
    }


}

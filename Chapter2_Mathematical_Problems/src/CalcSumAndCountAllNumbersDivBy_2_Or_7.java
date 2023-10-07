/*Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up
to a given maximum value (exclusive) and output it to the console. Write method void
calcSumAndCountAllNumbersDivBy_2_Or_7(int). Extend it so that it returns the two
values instead of performing the console output.
*/

// Importamos la clase lista para poder agregar los números
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CalcSumAndCountAllNumbersDivBy_2_Or_7 {

    void calcSumAndCountAllNumbersDivBy_2_Or_7(int max_){

        // Creamos un ArrayList para almacenar los números
        ArrayList numbers = new ArrayList();
        // Inicializamos la variable suma
        int sum = 0;

        int length;
        // Divisible por 2
        for (int i = 1; i < max_; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
            // Revisamos si el max_ es divisible entre 7. Utilizamos el módulo.
            if (i % 7 == 0){
                // Agregamos el número a la lista
                numbers.add(i);
            }
        }

        Set numbersSet = new HashSet(numbers);

        length = numbersSet.size();
        
        System.out.println("Cuenta de " + max_ + " es: " + length);

        // Sumamos los valores dentro del numberSet
        for (Object number: numbersSet){
            sum += (int) number;
        }

        // Imprimimos la suma
        System.out.println("La suma de los números naturales del 1 al " + max_ + " es: " + sum);


        /* Approach to delete duplicates from an ArrayList:
         * Get the ArrayList with duplicate values.
         * Create another ArrayList.
         * Traverse through the first arraylist and store the first appearance of each element into the second arraylist using contains() method.
         * The second ArrayList contains the elements with duplicates removed.*/

/*        ArrayList numbersNoDuplicates = new ArrayList();
        for (int number : numbers){
            // If the element is not present in the new list, add it.
            if(!numbersNoDuplicates.contains(number)){
                numbersNoDuplicates.add(number);
            }
        }*/

    }
}

package UNIR.app.Checksum;
import java.lang.NumberFormatException;
/*
* Create method int calcChecksum(String) that performs the following position-based
calculation for the checksum of a number of any length given as a string, with the n digits
modeled as z1 to zn:
(z1 + 2 * z2 + 3 * z3 + ... + n * zn) % 10
* */
public class Checksum {
    // The class has a checksum attribute, which will be obtained by the method calcChecksum
    private int checksum;

    // Defining the constructor
    public int calcChecksum(String number_){
        // Declare a variable to hold the sum
        int checksum = 0;

        // Check if the string is numeric, not empty, and not null
        if (isNumeric(number_)){
            // Iterate through the characters of the string:
            for (int i = 0; i < number_.length(); i++){
                checksum += ((i + 1) * Character.getNumericValue(number_.charAt(i)));
            }
        }
        return checksum % 10;
    }


    private Boolean isNumeric(String number_){
        // This method will check if the string is numeric, not empty, and not null
        if (number_ == null || number_.length() == 0){
            return false;
        }
        try{
            long num = Long.parseLong(number_);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

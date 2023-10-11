package UNIR.app.PrimeNumberPairs;
import java.util.ArrayList;
/*The purpose of this class is to offer a tuple of 3 lists that contain the resulting lists for twin, cousin, and sexy primes
* This class is to be used with PrimeNumberPairs.java, and it's just an auxiliary class.
* */
public class ResultPrimes {
    // Defining the attributes (lists)
    private ArrayList<Integer> twinPrimes;
    private ArrayList<Integer> cousinPrimes;
    private ArrayList<Integer> sexyPrimes;

    // Defining the constructor
    public ResultPrimes(ArrayList<Integer> twinPrimes_, ArrayList<Integer> cousinPrimes_, ArrayList<Integer> sexyPrimes_){
        this.twinPrimes = twinPrimes_;
        this.cousinPrimes = cousinPrimes_;
        this.sexyPrimes = sexyPrimes_;
    }
    // Creating the getters
    public ArrayList<Integer> getTwinPrimes(){
        return this.twinPrimes;
    }
    public ArrayList<Integer> getCousinPrimes(){
        return this.cousinPrimes;
    }
    public ArrayList<Integer> getSexyPrimes(){
        return this.sexyPrimes;
    }
    // Creating the setters
    public void setTwinPrimes(ArrayList<Integer> twinPrimes_){
        this.twinPrimes = twinPrimes_;
    }
    public void setCousinPrimes(ArrayList<Integer> cousinPrimes_){
        this.cousinPrimes = cousinPrimes_;
    }
    public void setSexyPrimes(ArrayList<Integer> sexyPrimes_){
        this.sexyPrimes = sexyPrimes_;
    }
}

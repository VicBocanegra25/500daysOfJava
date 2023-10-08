package BasicArithmetic;

import java.util.ArrayList;

/*// Custom class to hold tuples.
In this package, it will store the sum and the ArrayList of numbers*/
public class Result {
    // Atributes
    private int sum;
    private int length;

    // Creating the constructor
    public Result(int sum_, int length_){
        this.sum = sum_;
        this.length = length_;
    }

    // Creating the getters
    public int getSum(){
        return this.sum;
    }
    public int getLength(){
        return this.length;
    }

    // Creating the setters
    public void setSum(int sum_){
        this.sum = sum_;
    }
    public void setLength(int length_){
        this.length = length_;
    }
}

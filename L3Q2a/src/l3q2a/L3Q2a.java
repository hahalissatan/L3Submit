
package l3q2a;
import java.util.Random;
public class L3Q2a {

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(6);
        String[]numbers = {"zero", "one", "two", "three", "four", "five"};
        System.out.printf("%d is %s. %n", randomNum, numbers[randomNum]);
        
    }
    
}

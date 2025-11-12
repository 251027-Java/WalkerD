import java.util.Arrays;

public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello World");
        IO.println("Hello Walk"); //newer
        //do the same job; comes down to convention

        /**
         * Variables:
         * 1. int - integer value
         * 2. double - decimal values
         * 3. String - array of characters
         * 4. float - floating point decimal
         * 5. char - characters (letters, numbers, symbols, etc.)
         * 6. void - return nothing; mostly return type
         * 7. boolean - true or false
         * 8. long - BIG integer value
         * 9. short - SMALL integer value
         * 10. byte - EVEN SMALLER integer value
         */

    String newString = "Good afternoon";
    for(int i=0; i < newString.length(); i++){
        System.out.println(newString.charAt(i));
    }

    }
}

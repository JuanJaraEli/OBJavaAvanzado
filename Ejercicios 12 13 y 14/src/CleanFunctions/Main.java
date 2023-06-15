package CleanFunctions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer []numbers = {1, 2, 3, 4, 5};
        System.out.println(multiplyNumbers(numbers));
        try {
            System.out.println(factorial(5));
        } catch (IllegalArgumentException e){
            System.out.println("An error ocurred: " + e.getMessage());
        }
    }

    /**
     * Method that calculates the product of the numbers contained in an array.
     * @param numbers array that contains Integer numbers.
     * @return the result of the multiplication.
     */
    public static Integer multiplyNumbers (Integer []numbers){
        return  Arrays.stream(numbers).reduce(1,(a ,b) -> a * b);
    }

    /**
     * Method that calculates the factorial of a number.
     * @param number should be a non negative Integer.
     * @return the result of the factorial of the number provided.
     * @throws IllegalArgumentException in case a negative Integer is provided.
     */
    public static Integer factorial (Integer number) throws IllegalArgumentException{
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        if (number == 0){
            return 1;
        }
        return number * factorial(number - 1);
    }
}

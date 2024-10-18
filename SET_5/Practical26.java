import java.io.*;

// Custom exception class
class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class Practical26 {
    

    // Method that throws a custom exception
    public static void throwCustomException() throws CustomException {
        throw new CustomException("This is a custom exception");
    }

    // Method to demonstrate checked exceptions
    public static void checkedExceptions() throws IOException {
        // Simulate an IOException
        throw new IOException("This is an IOException");

       
    }

    // Method to demonstrate unchecked exceptions
    public static void uncheckedExceptions() {
        // Simulate a NullPointerException
        String str = null;
        System.out.println(str.length());

        // Simulate an ArithmeticException
        // int result = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            // Throw custom exception
            throwCustomException();
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        try {
            
            checkedExceptions();
        } catch (IOException  e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            
            uncheckedExceptions();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
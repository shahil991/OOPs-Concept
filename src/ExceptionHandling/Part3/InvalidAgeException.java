package ExceptionHandling.Part3;

// Unchecked
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}

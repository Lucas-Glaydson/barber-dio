package barber.barber.middleware.exceptions;

public class CreateSchedulingException extends RuntimeException {
    public CreateSchedulingException() {
        super("Error to create a new schedule");
    }
}

package barber.barber.middleware.exceptions;

public class FindSchedulingException extends RuntimeException {
  public FindSchedulingException() {
    super("Error to find this schedule!");
  }
}

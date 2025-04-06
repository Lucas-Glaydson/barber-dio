package barber.barber.middleware.exceptionsHandler;

import barber.barber.middleware.exceptions.CreateSchedulingException;
import barber.barber.middleware.exceptions.FindSchedulingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ScheduleExceptionHandler {

    @ExceptionHandler(CreateSchedulingException.class)
    private ResponseEntity<String> createScheduleException() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new CreateSchedulingException().getMessage());
    }


    @ExceptionHandler(FindSchedulingException.class)
    private ResponseEntity<String> findScheduleException() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new FindSchedulingException().getMessage());
    }
}

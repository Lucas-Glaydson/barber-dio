package barber.barber.app.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Date;

public record CreateSchedulingDto(
        @NotNull @Size(min = 2)
        String barberName,
        @NotNull @Size(min = 2)
        String firstName,
        @NotNull @Size(min = 2)
        String lastName,
        @NotNull @Size(min = 2)
        String contact,
        @NotNull
        Date schedulingDate) {
}

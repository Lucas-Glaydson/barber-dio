package barber.barber.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record CreateSchedulingDto(
        @NotNull @Min(2)
        String barberName,
        @NotNull @Min(2)
        String firstName,
        @NotNull @Min(2)
        String lastName,
        @NotNull @Min(2)
        String contact,
        @NotNull
        Date schedulingDate) {
}

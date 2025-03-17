package barber.barber.factory;

import barber.barber.dto.CreateSchedulingDto;
import barber.barber.model.Scheduling;

public class SchedulingFactory {
    public static Scheduling transformSchedulingDto(CreateSchedulingDto schedulingDto) {
        Scheduling scheduling = new Scheduling();

        scheduling.setBarberName(schedulingDto.barberName());
        scheduling.setContact(schedulingDto.contact());
        scheduling.setFirstName(schedulingDto.firstName());
        scheduling.setLastName(schedulingDto.lastName());
        scheduling.setSchedulingDate(schedulingDto.schedulingDate());

        return scheduling;
    }
}

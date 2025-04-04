package barber.barber.app.factory;

import barber.barber.app.dto.CreateSchedulingDto;
import barber.barber.app.entity.Scheduling;

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

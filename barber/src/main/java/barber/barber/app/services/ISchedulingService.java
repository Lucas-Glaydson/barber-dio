package barber.barber.app.services;

import barber.barber.app.dto.CreateSchedulingDto;
import barber.barber.app.entity.Scheduling;

public interface ISchedulingService {

    Scheduling createScheduling(CreateSchedulingDto schedulingDto);

    void deleteScheduling(String schedulingId);
}

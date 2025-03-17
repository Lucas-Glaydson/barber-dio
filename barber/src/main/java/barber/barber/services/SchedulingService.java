package barber.barber.services;

import barber.barber.dto.CreateSchedulingDto;
import barber.barber.factory.SchedulingFactory;
import barber.barber.model.Scheduling;
import barber.barber.repository.SchedulingRepository;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {
    private final SchedulingRepository schedulingRepository;

    public SchedulingService(SchedulingRepository schedulingRepository) {
        this.schedulingRepository = schedulingRepository;
    }

    public Scheduling createScheduling(CreateSchedulingDto schedulingDto) {
        return this.schedulingRepository.save(SchedulingFactory.transformSchedulingDto(schedulingDto));
    }
}

package barber.barber.app.services;

import barber.barber.app.dto.CreateSchedulingDto;
import barber.barber.app.factory.SchedulingFactory;
import barber.barber.app.entity.Scheduling;
import barber.barber.app.repository.SchedulingRepository;
import barber.barber.middleware.exceptions.CreateSchedulingException;
import barber.barber.middleware.exceptions.FindSchedulingException;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService implements ISchedulingService {
    private final SchedulingRepository schedulingRepository;

    public SchedulingService(SchedulingRepository schedulingRepository) {
        this.schedulingRepository = schedulingRepository;
    }

    @Override
    public Scheduling createScheduling(CreateSchedulingDto schedulingDto) {
        try {
            return this.schedulingRepository.save(SchedulingFactory.transformSchedulingDto(schedulingDto));
        } catch(Exception e) {
            throw new CreateSchedulingException();
        }
    }

    @Override
    public void deleteScheduling(String schedulingId) {
        if(!this.schedulingRepository.existsById(schedulingId)) {
            throw new FindSchedulingException();
        }

        this.schedulingRepository.deleteById(schedulingId);
    }
}

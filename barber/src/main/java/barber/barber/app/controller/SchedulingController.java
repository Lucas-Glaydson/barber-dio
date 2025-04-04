package barber.barber.app.controller;

import barber.barber.app.dto.CreateSchedulingDto;
import barber.barber.app.entity.Scheduling;
import barber.barber.app.services.ISchedulingService;
import barber.barber.app.services.SchedulingService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/scheduling")
public class SchedulingController {
    private final ISchedulingService ischedulingService;

    public SchedulingController(SchedulingService schedulingService) {
        this.ischedulingService = schedulingService;
    }

    @PostMapping()
    public ResponseEntity<Scheduling> scheduling(@Valid @RequestBody CreateSchedulingDto createSchedulingDto) {
        return ResponseEntity.ok().body(ischedulingService.createScheduling(createSchedulingDto));
    }
}

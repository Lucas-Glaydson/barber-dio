package barber.barber.controller;

import barber.barber.dto.CreateSchedulingDto;
import barber.barber.model.Scheduling;
import barber.barber.services.SchedulingService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/scheduling")
public class SchedulingController {
    private final SchedulingService schedulingService;

    public SchedulingController(SchedulingService schedulingService) {
        this.schedulingService = schedulingService;
    }

    @PostMapping()
    public ResponseEntity<Scheduling> scheduling(@Valid @RequestBody CreateSchedulingDto createSchedulingDto) {
        return ResponseEntity.ok().body(schedulingService.createScheduling(createSchedulingDto));
    }
}

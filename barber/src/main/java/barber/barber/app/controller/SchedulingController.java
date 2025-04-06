package barber.barber.app.controller;

import barber.barber.app.dto.CreateSchedulingDto;
import barber.barber.app.entity.Scheduling;
import barber.barber.app.services.ISchedulingService;
import barber.barber.app.services.SchedulingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Scheduling> cretaeScheduling(@Valid @RequestBody CreateSchedulingDto createSchedulingDto) {
        Scheduling newScheduling = ischedulingService.createScheduling(createSchedulingDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newScheduling);
    }


    @DeleteMapping()
    public ResponseEntity<String> deleteScheduling(@RequestParam String id){
        ischedulingService.deleteScheduling(id);
        return ResponseEntity.notFound().build();
    }
}

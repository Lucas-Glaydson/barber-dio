import { Component } from '@angular/core';
import { SchedulingService } from '../../services/scheduling.service';
import { FormsModule } from "@angular/forms";
import { Schedule } from '../../model/Schedule';
import { error } from 'console';

@Component({
  selector: 'app-forms',
  imports: [FormsModule],
  templateUrl: './forms.component.html',
  styleUrl: './forms.component.css',
  standalone: true
})
export class FormsComponent {
  firstName: string = "";
  lastName: string = "";
  barberName: string = "";
  contact: string = "";
  schedulingDate!: Date;

  constructor(private scheduleService: SchedulingService){

  }

  onSubmint(){
    const schedule: Schedule = {
      firstName: this.firstName,
      lastName: this.lastName,
      barberName: this.barberName,
      contact: this.contact,
      schedulingDate: this.schedulingDate
    }

    console.log(schedule)

    this.scheduleService.createScheduling(schedule).subscribe({
      next: (reply) =>  console.log(reply),
      error: (error) => console.log("Error: ", error)
    })
  }
}

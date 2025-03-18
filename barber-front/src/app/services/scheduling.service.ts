import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Schedule } from '../model/Schedule';

@Injectable({
  providedIn: 'root'
})
export class SchedulingService {

  constructor(
    private httpClient: HttpClient
  ) { }

  createScheduling(schedule: Schedule): Observable<Schedule>{
    return this.httpClient.post<Schedule>("http://localhost:8080/scheduling", schedule)
  }
}

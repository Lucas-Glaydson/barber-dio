package barber.barber.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Scheduling {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String barberName;
    private String firstName;
    private String lastName;
    private String contact;
    private Date schedulingDate;

    public void setBarberName(String barberName) {
        this.barberName = barberName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setSchedulingDate(Date schedulingDate) {
        this.schedulingDate = schedulingDate;
    }
}

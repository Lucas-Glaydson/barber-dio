package barber.barber.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
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
}

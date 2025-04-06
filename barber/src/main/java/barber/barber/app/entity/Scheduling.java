package barber.barber.app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "scheduling")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Scheduling {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String barberName;
    private String firstName;
    private String lastName;
    private String contact;
    private Date schedulingDate;
}

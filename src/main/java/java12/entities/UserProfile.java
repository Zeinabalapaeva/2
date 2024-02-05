package java12.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "userprofile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
    @Id
    private  Long id ;

    private  String userName;
    private  String email;
   private LocalDate registrdate;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

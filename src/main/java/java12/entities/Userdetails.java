package java12.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table (name= "userdetails")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator( name = "user_gen",sequenceName ="usersetails_seq" ,allocationSize = 1)
public class Userdetails  extends  BaseEntities{


    @Id
    private  Long id;
    private LocalDate Date_of_birth;
    private String address;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

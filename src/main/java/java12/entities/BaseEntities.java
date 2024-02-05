package java12.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntities {
  //  @Id
  //  @GeneratedValue(generator ="base_is _gen ",strategy = GenerationType.SEQUENCE);
   // private  Long id;
}

package one.digitalinnovation.personapi.entities;

import lombok.*;
import one.digitalinnovation.personapi.enums.ProfessionType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Profession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    @Column(nullable = false)
    private ProfessionType type;

    @Column(nullable = true)
    private String name;
}

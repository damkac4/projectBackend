package com.example.ProjektBackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "nadwozie")
public class Nadwozie {

    @Id
    @SequenceGenerator(
            name = "nadwozie_sequence",
            sequenceName = "nadwozie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "nadwozie_sequence"
    )
    Long id;
    String typ;
    @JsonIgnore
    @OneToMany(mappedBy = "nadwozie")
    private Set<Ogloszenie> ogloszenie;
}

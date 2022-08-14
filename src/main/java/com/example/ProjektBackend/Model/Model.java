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
@Table(name = "model")
public class Model {
    @Id
    @SequenceGenerator(
            name = "ogloszenie_sequence",
            sequenceName = "ogloszenie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ogloszenie_sequence"
    )
    Long id;
    String nazwa;
    @JsonIgnore
    @OneToMany(mappedBy = "model")
    private Set<Ogloszenie> ogloszenie;
}

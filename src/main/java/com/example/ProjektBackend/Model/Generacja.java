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
@Table(name = "generacja")
public class Generacja {

    @Id
    @SequenceGenerator(
            name = "ogeneracja_sequence",
            sequenceName = "generacja_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generacja_sequence"
    )
    Long id;
    String nazwa;
    @JsonIgnore
    @OneToMany(mappedBy = "generacja")
    private Set<Ogloszenie> ogloszenie;
}

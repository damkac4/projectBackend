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
@Table(name = "paliwo")
public class Paliwo {

    @Id
    @SequenceGenerator(
            name = "paliwo_sequence",
            sequenceName = "paliwo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "paliwo_sequence"
    )
    Long id;
    String rodzaj;
    @JsonIgnore
    @OneToMany(mappedBy = "paliwo")
    private Set<Ogloszenie> ogloszenie;
}

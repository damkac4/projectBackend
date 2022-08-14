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
@Table(name = "marka")
public class Marka {

    @Id
    @SequenceGenerator(
            name = "marka_sequence",
            sequenceName = "marka_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "marka_sequence"
    )
    private Long id;
    private String nazwa;

    @JsonIgnore
    @OneToMany(mappedBy = "marka")
    private Set<Ogloszenie> ogloszenie;

}

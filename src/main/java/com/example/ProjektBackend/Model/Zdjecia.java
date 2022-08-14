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
@Table(name = "zdjecia")
public class Zdjecia {
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
    String zdjecie1;
    String zdjecie2;
    String zdjecie3;
    String zdjecie4;
    String zdjecie5;
    String zdjecie6;
    @JsonIgnore
    @OneToOne(mappedBy = "zdjecia")
    private Ogloszenie ogloszenie;
}

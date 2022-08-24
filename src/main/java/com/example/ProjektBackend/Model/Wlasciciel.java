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
@Table(name = "wlasciciel")
public class Wlasciciel {
    @Id
    @SequenceGenerator(
            name = "wlasciciel_sequence",
            sequenceName = "wlasciciel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "wlasciciel_sequence"
    )
    private Long id;
    private String telefon;
    private String mail;
    private String imie;

    @JsonIgnore
    @OneToMany(mappedBy = "wlasciciel")
    private Set<Ogloszenie> ogloszenie;

    public Wlasciciel( String numer, String mail, String imie) {
        this.telefon = numer;
        this.mail = mail;
        this.imie = imie;
    }
}
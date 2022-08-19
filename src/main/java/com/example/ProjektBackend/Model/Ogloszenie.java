package com.example.ProjektBackend.Model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ogloszenie")
public class Ogloszenie {

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
    private Long id;
    private String przebieg;
    private String rok;
    private String pojemnosc;
    private String miejscowosc;
    private String cena;

    @ManyToOne
    @JoinColumn(name = "marka_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Marka marka;
    @ManyToOne
    @JoinColumn(name = "paliwo_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Paliwo paliwo;
    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Model model;
    @ManyToOne
    @JoinColumn(name = "generacja_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Generacja generacja;


    public Ogloszenie(String przebieg, String rok, String pojemnosc,
                      String miejscowosc, String cena, Marka marka, Paliwo paliwo,
                      Model model, Generacja generacja) {
        this.przebieg = przebieg;
        this.rok = rok;
        this.pojemnosc = pojemnosc;
        this.miejscowosc = miejscowosc;
        this.cena = cena;
        this.marka = marka;
        this.paliwo = paliwo;
        this.model = model;
        this.generacja = generacja;

    }
}

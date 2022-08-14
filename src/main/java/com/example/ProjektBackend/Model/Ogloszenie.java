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
//    private Long markaId;
//    private Long zdjeciaId;
//    private Long paliwoId;
//    private Long modelId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Marka marka;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Paliwo paliwo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Model model;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, insertable = false, updatable = false)
    private Zdjecia zdjecia;


    public Ogloszenie(String przebieg, String rok, String pojemnosc,
                      String miejscowosc, String cena, Marka marka, Paliwo paliwo,
                      Model model, Zdjecia zdjecia) {
        this.przebieg = przebieg;
        this.rok = rok;
        this.pojemnosc = pojemnosc;
        this.miejscowosc = miejscowosc;
        this.cena = cena;
        this.marka = marka;
        this.paliwo = paliwo;
        this.model = model;
        this.zdjecia = zdjecia;

    }
}

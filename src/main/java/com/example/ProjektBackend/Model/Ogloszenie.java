package com.example.ProjektBackend.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
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
    private Long przebieg;
    private int rok;
    private Long pojemnosc;
    private Long cena;
    private Long moc;
    private String kolor;
    private String stan;
    private double spalanie;
    private String skrzynia;
    private String bezwypadkowy;
    private String naped;
    private LocalDate data;
    private LocalTime godzina;

    @ManyToOne
    @JoinColumn(name = "marka_id", referencedColumnName = "id", nullable = false)
    private Marka marka;
    @ManyToOne
    @JoinColumn(name = "paliwo_id", referencedColumnName = "id", nullable = false)
    private Paliwo paliwo;
    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)
    private Model model;
    @ManyToOne
    @JoinColumn(name = "generacja_id", referencedColumnName = "id", nullable = false)
    private Generacja generacja;
    @ManyToOne
    @JoinColumn(name = "nadwozie_id", referencedColumnName = "id", nullable = false)
    private Nadwozie nadwozie;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wlasciciel_id", referencedColumnName = "id", nullable = false)
    private Wlasciciel wlasciciel;

    public Ogloszenie(Long przebieg, int rok, Long pojemnosc, Long cena, Long moc, String kolor, String stan, double spalanie, Marka marka, Paliwo paliwo,
                      Model model, Generacja generacja, Nadwozie nadwozie, Wlasciciel wlasciciel, String naped, String skrzynia, String bezwypadkowy) {
        this.przebieg = przebieg;
        this.rok = rok;
        this.pojemnosc = pojemnosc;
        this.cena = cena;
        this.moc = moc;
        this.kolor = kolor;
        this.stan = stan;
        this.spalanie = spalanie;
        this.marka = marka;
        this.paliwo = paliwo;
        this.model = model;
        this.generacja = generacja;
        this.nadwozie = nadwozie;
        this.wlasciciel = wlasciciel;
        this.skrzynia = skrzynia;
        this.bezwypadkowy = bezwypadkowy;
        this.naped = naped;
    }
}

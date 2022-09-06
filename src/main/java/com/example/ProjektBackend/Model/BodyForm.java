package com.example.ProjektBackend.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BodyForm {

    Nadwozie nadwozie;
    Marka marka;
    Model model;
    Paliwo paliwo;
    Generacja generacja;
    int cenaOd;
    int cenaDo;
    int rokOd;
    int rokDo;
    int przebiegOd;
    int przebiegDo;
}

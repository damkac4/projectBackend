package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.BodyForm;
import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Repository.OgloszenieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OgloszenieService {

    private final OgloszenieRepository ogloszenieRepository;

    @Autowired
    public OgloszenieService(OgloszenieRepository ogloszenieRepository) {
        this.ogloszenieRepository = ogloszenieRepository;

    }

    public Optional<Ogloszenie> findById(Long id){

        return ogloszenieRepository.findById(id);

    }


    public List<Ogloszenie> getAll(BodyForm bodyForm) {

        Long nadwozieId;
        Long paliwoId;
        Long markaId;
        Long modelId;
        Long generacjaId;

        int cenaOd = bodyForm.getCenaOd();
        int cenaDo = bodyForm.getCenaDo();
        int rokOd = bodyForm.getRokOd();
        int rokDo = bodyForm.getRokDo();
        int przebiegOd = bodyForm.getPrzebiegOd();
        int przebiegDo = bodyForm.getPrzebiegDo();

        if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() == null && bodyForm.getMarka() == null) {
            return ogloszenieRepository.getAll(cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() == null && bodyForm.getMarka() == null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            return ogloszenieRepository.getAll2(nadwozieId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() != null && bodyForm.getMarka() == null) {
            paliwoId = bodyForm.getPaliwo().getId();
            return ogloszenieRepository.getAll3(paliwoId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() != null && bodyForm.getMarka() == null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            paliwoId = bodyForm.getPaliwo().getId();
            return ogloszenieRepository.getAll4(nadwozieId, paliwoId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() == null && bodyForm.getMarka() != null && bodyForm.getModel() == null) {
            markaId = bodyForm.getMarka().getId();
            return ogloszenieRepository.getAll5(markaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() == null && bodyForm.getMarka() != null && bodyForm.getModel() == null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            markaId = bodyForm.getMarka().getId();
            return ogloszenieRepository.getAll6(nadwozieId, markaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() != null && bodyForm.getMarka() != null && bodyForm.getModel() == null) {
            paliwoId = bodyForm.getPaliwo().getId();
            markaId = bodyForm.getMarka().getId();
            return ogloszenieRepository.getAll7(paliwoId, markaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() != null && bodyForm.getMarka() != null && bodyForm.getModel() == null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            paliwoId = bodyForm.getPaliwo().getId();
            markaId = bodyForm.getMarka().getId();
            return ogloszenieRepository.getAll8(nadwozieId, paliwoId, markaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() == null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() == null) {
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            return ogloszenieRepository.getAll9(markaId, modelId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() == null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() == null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            return ogloszenieRepository.getAll10(nadwozieId, markaId, modelId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);

        } else if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() != null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() == null) {
            paliwoId = bodyForm.getPaliwo().getId();
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            return ogloszenieRepository.getAll11(paliwoId, markaId, modelId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);

        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() != null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() == null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            paliwoId = bodyForm.getNadwozie().getId();
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            return ogloszenieRepository.getAll12(nadwozieId, paliwoId, markaId, modelId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() == null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() != null) {
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            generacjaId = bodyForm.getGeneracja().getId();
            return ogloszenieRepository.getAll13(markaId, modelId, generacjaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() == null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() != null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            generacjaId = bodyForm.getGeneracja().getId();
            return ogloszenieRepository.getAll14(nadwozieId, markaId, modelId, generacjaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        } else if (bodyForm.getNadwozie() == null && bodyForm.getPaliwo() != null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() != null) {
            paliwoId = bodyForm.getPaliwo().getId();
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            generacjaId = bodyForm.getGeneracja().getId();
            return ogloszenieRepository.getAll15(paliwoId, markaId, modelId, generacjaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);

        } else if (bodyForm.getNadwozie() != null && bodyForm.getPaliwo() != null && bodyForm.getMarka() != null && bodyForm.getModel() != null && bodyForm.getGeneracja() != null) {
            nadwozieId = bodyForm.getNadwozie().getId();
            paliwoId = bodyForm.getPaliwo().getId();
            markaId = bodyForm.getMarka().getId();
            modelId = bodyForm.getModel().getId();
            generacjaId = bodyForm.getGeneracja().getId();
            return ogloszenieRepository.getAll16(nadwozieId, paliwoId, markaId, modelId, generacjaId, cenaOd, cenaDo, rokOd, rokDo, przebiegOd, przebiegDo);
        }
        return new ArrayList<>();
    }
}

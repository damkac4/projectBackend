package com.example.ProjektBackend.Repository;

import com.example.ProjektBackend.Model.Model;
import com.example.ProjektBackend.Model.Ogloszenie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OgloszenieRepository extends JpaRepository<Ogloszenie, Long> {



    @Query(value = "Select * from Ogloszenie where cena >= ?1 and cena <= ?2 and rok >= ?3 and rok <= ?4 and przebieg >= ?5 and przebieg <= ?6",nativeQuery = true)
    ArrayList<Ogloszenie> getAll(int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and cena >= ?2 and cena <= ?3 and rok >= ?4 and rok <= ?5 and przebieg >= ?6 and przebieg <= ?7",nativeQuery = true)
    ArrayList<Ogloszenie> getAll2(Long nadwozieId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where paliwo_id = ?1 and cena >= ?2 and cena <= ?3 and rok >= ?4 and rok <= ?5 and przebieg >= ?6 and przebieg <= ?7",nativeQuery = true)
    ArrayList<Ogloszenie> getAll3(Long paliwoId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and paliwo_id = ?2 and cena >= ?3 and cena <= ?4 and rok >= ?5 and rok <= ?6 and przebieg >= ?7 and przebieg <= ?8",nativeQuery = true)
    ArrayList<Ogloszenie> getAll4(Long nadwozieId, Long paliwoId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where marka_id = ?1 and cena >= ?2 and cena <= ?3 and rok >= ?4 and rok <= ?5 and przebieg >= ?6 and przebieg <= ?7",nativeQuery = true)
    ArrayList<Ogloszenie> getAll5(Long markaId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and marka_id = ?2 and cena >= ?3 and cena <= ?4 and rok >= ?5 and rok <= ?6 and przebieg >= ?7 and przebieg <= ?8",nativeQuery = true)
    ArrayList<Ogloszenie> getAll6(Long nadwozieId, Long markaId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where paliwo_id = ?1 and marka_id = ?2 and cena >= ?3 and cena <= ?4 and rok >= ?5 and rok <= ?6 and przebieg >= ?7 and przebieg <= ?8",nativeQuery = true)
    ArrayList<Ogloszenie> getAll7(Long paliwoId, Long markaId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and paliwo_id = ?2 and marka_id = ?3 and cena >= ?4 and cena <= ?5 and rok >= ?6 and rok <= ?7 and przebieg >= ?8 and przebieg <= ?9  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll8(Long nadwozieId, Long paliwoId, Long markaId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where marka_id = ?1 and model_id = ?2 and cena >= ?3 and cena <= ?4 and rok >= ?5 and rok <= ?6 and przebieg >= ?7 and przebieg <= ?8  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll9(Long markaId, Long modelId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and marka_id = ?2 and model_id = ?3 and cena >= ?4 and cena <= ?5 and rok >= ?6 and rok <= ?7 and przebieg >= ?8 and przebieg <= ?9  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll10(Long nadwozieId, Long markaId, Long modelId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where paliwo_id = ?1 and marka_id = ?2 and model_id = ?3 and cena >= ?4 and cena <= ?5 and rok >= ?6 and rok <= ?7 and przebieg >= ?8 and przebieg <= ?9  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll11(Long paliwoId, Long markaId, Long modelId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and paliwo_id = ?2 and marka_id = ?3 and model_id = ?4 and cena >= ?5 and cena <= ?6 and rok >= ?7 and rok <= ?8 and przebieg >= ?9 and przebieg <= ?10  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll12(Long nadwozieId, Long paliwoId, Long markaId, Long modelId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where marka_id = ?1 and model_id = ?2 and generacja_id = ?3 and cena >= ?4 and cena <= ?5 and rok >= ?6 and rok <= ?7 and przebieg >= ?8 and przebieg <= ?9  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll13(Long markaId, Long modelId, Long generacjaId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and marka_id = ?2 and model_id = ?3 and generacja_id = ?4 and cena >= ?5 and cena <= ?6 and rok >= ?7 and rok <= ?8 and przebieg >= ?9 and przebieg <= ?10  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll14(Long nadwozieId, Long markaId, Long modelId, Long generacjaId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where paliwo_id = ?1 and marka_id = ?2 and model_id = ?3 and generacja_id = ?4 and cena >= ?5 and cena <= ?6 and rok >= ?7 and rok <= ?8 and przebieg >= ?9 and przebieg <= ?10  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll15(Long paliwoId, Long markaId, Long modelId, Long generacjaId, int cenaOd, int cenaDo, int rokOd, int rokDo, int przebiegOd, int przebiegDo);

    @Query(value = "Select * from Ogloszenie where nadwozie_id = ?1 and paliwo_id = ?2 and marka_id = ?3 and model_id = ?4 and " +
            "generacja_id = ?5 and cena >= ?6 and cena <= ?7 and rok >= ?8 and rok <= ?9 and przebieg >= ?10 and przebieg <= ?11  ",nativeQuery = true)
    ArrayList<Ogloszenie> getAll16(Long nadwozieId, Long paliwoId, Long markaId, Long modelId, Long generacjaId, int cenaOd, int cenaDo, int rokOd,
                                 int rokDo,  int przebiegOd, int przebiegDo);
}

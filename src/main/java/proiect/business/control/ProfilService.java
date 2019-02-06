package proiect.business.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.persistence.entity.Profil;
import proiect.persistence.repository.ProfilRepository;

import java.util.Optional;

@Service
public class ProfilService {
    @Autowired
    private ProfilRepository profilRepository;

    public Profil getUserProfile(Long profilId) {
        Optional<Profil> profil = profilRepository.findProfilById(profilId);
        return profil.get();
    }

    public void addProfil(Profil profil){
        profilRepository.save(profil);
    }

}

package proiect.client.resources;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import proiect.business.control.ProfilService;
import proiect.persistence.entity.Profil;

@Controller
@RequestMapping("profil")
public class ProfilResource {
    private static final Logger log = LogManager.getLogger(UserResource.class);

    @Autowired
    private ProfilService profilService ;


    @PostMapping(path="/addProfil")
    @ResponseStatus(HttpStatus.OK)
    public void addUser(@RequestBody Profil profil){
        log.info("add profil: profil={}", profil);
        profilService.addProfil(profil);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    Profil get(@RequestParam Long profilId) {
        return profilService.getUserProfile(profilId);
    }
}

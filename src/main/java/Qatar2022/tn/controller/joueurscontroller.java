package Qatar2022.tn.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Qatar2022.tn.entities.joueurs;
import Qatar2022.tn.entities.matchs;
import Qatar2022.tn.service.joueurservice;

@RestController
@RequestMapping("/api")
public class joueurscontroller {
	@Autowired
	joueurservice jou;
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getjoueurs")
	public List<joueurs> getAllMatchs() {
		List<joueurs> joueur = jou.findAllJoueurs();

        return joueur;
	    
	}

}

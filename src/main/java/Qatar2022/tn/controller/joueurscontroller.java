package Qatar2022.tn.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Qatar2022.tn.entities.joueurs;
import Qatar2022.tn.service.joueurservice;
@CrossOrigin(origins = "http://localhost:4200"	)

@RestController
@RequestMapping("/api")
public class joueurscontroller {
	@Autowired
	joueurservice jou;
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getjoueurs")
	public List<joueurs> getAllJoueurs() {
		List<joueurs> joueur = jou.findAllJoueurs();

        return joueur;
	    
	}
	@CrossOrigin(origins = "http://localhost:4200"	)

	@PostMapping("/addjoueurs") 
	public joueurs createJoueurs(@Valid @RequestBody joueurs joueur) {
		return jou.saveJoueurs(joueur);
		}
	@GetMapping("/getjoueurs/{id}")
	public ResponseEntity<joueurs> getjoueurs(@PathVariable(value = "id") Long id) {
	joueurs joueur = jou.findJoueurs(id);
if(joueur==null) {
	return ResponseEntity.notFound().build();
}
        return ResponseEntity.ok().body(joueur);
	    
	}
	@PutMapping("/updatejoueurs/{id}")
	public ResponseEntity<joueurs> updatejoueurs(@PathVariable(value = "id") Long id,@Valid @RequestBody joueurs joueursdetails ) { 
		joueurs joueur = jou.findJoueurs(id);
		if(joueur==null) {
			return ResponseEntity.notFound().build();
		}
	joueur.setNom(joueursdetails.getNom());
	joueur.setEquipest(joueursdetails.getEquipest());
	joueur.setPrenom(joueursdetails.getPrenom());
	joueur.setNumero(joueursdetails.getNumero());
	
	joueurs updatejoueurs=jou.saveJoueurs(joueur);
	return ResponseEntity.ok().body(updatejoueurs);
	}	@CrossOrigin(origins = "http://localhost:4200"	)

	@DeleteMapping("/deletejoueurs/{id}")
	 public ResponseEntity<joueurs> DeleteMatchs(@PathVariable(value = "id") Long id){
		joueurs joueur=jou.findJoueurs(id);
		if(joueur==null) {
			return ResponseEntity.notFound().build();
		}
		jou.delete(joueur);
		 return ResponseEntity.ok().build();	
	}



}

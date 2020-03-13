package Qatar2022.tn.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Qatar2022.tn.entities.equipes;
import Qatar2022.tn.service.*;

@RestController
@RequestMapping("/api")
public class equipescontroller {

	@Autowired 
	 
	equipeservice pserv ;
	
	
	@GetMapping("/getequipes")
	public List<equipes> getAlleEquipes() {
		List<equipes> equipe = pserv.findAllEquipes();

        return equipe;
	    
	}
	
	@PostMapping("/addequipes")
	public equipes createEquipes(@Valid @RequestBody equipes equipe) {
	    return pserv.saveEquipes(equipe);
	}
	
	/*@GetMapping("/getequipes/{id}")
	public equipes geteEquipes(@PathVariable(value = "id") Long id) {
		equipes equipe = pserv.findEquipes(id);

        return equipe;
	    
	}
	*/
	@GetMapping("/getequipes/{id}")
	public ResponseEntity<equipes> getEquipes(@PathVariable(value = "id") Long id) {
		equipes equipe = pserv.findEquipes(id);
if(equipe==null) {
	return ResponseEntity.notFound().build();
}
        return ResponseEntity.ok().body(equipe);
	    
	}
	@PutMapping("/updateequipes/{id}")
	public ResponseEntity<equipes> updateEquipes(@PathVariable(value = "id") Long id,@Valid @RequestBody equipes equipedetails ) { 
		equipes equipe = pserv.findEquipes(id);
		if(equipe==null) {
			return ResponseEntity.notFound().build();
		}
		
		equipe.setNom(equipedetails.getNom());
		equipe.setEffectif(equipedetails.getEffectif());
		equipe.setJoueur(equipedetails.getJoueur());
		equipe.setMatches(equipedetails.getMatches());
		
		equipes updateEquipes=pserv.saveEquipes(equipe);
		return ResponseEntity.ok().body(updateEquipes);
		
		
	}
@DeleteMapping("/deleteequipe/{id}")
 public ResponseEntity<equipes> DeleteEquipes(@PathVariable(value = "id") Long id){
	equipes equipe = pserv.findEquipes(id);
	if(equipe==null) {
		return ResponseEntity.notFound().build();
	}
	pserv.delete(equipe);
	 return ResponseEntity.ok().build();	
}
}







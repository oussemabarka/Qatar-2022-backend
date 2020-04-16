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

import Qatar2022.tn.entities.*;
import Qatar2022.tn.service.*;
@CrossOrigin(origins = "http://localhost:4200"	)

@RestController
@RequestMapping("/api")
public class arbitrecontroller {
	@Autowired
	arbitreservice arb;
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getarbitres")
	public List<arbitres> getAllArbitres() {
		List<arbitres> arbitre = arb.findAllArbitre();

        return arbitre;
	    
	}
	@CrossOrigin(origins = "http://localhost:4200"	)

	@PostMapping("/addarbitre") 
	public arbitres createArbitres(@Valid @RequestBody arbitres arbitre) {
		return arb.saveArbitre(arbitre);
		}
	@GetMapping("/getarbitre/{id}")
	public ResponseEntity<arbitres> getarbitre(@PathVariable(value = "id") Long id) {
	arbitres arbitre=arb.findArbitre(id);
if(arbitre==null) {
	return ResponseEntity.notFound().build();
}
        return ResponseEntity.ok().body(arbitre);
	    
	}
	@CrossOrigin(origins = "http://localhost:4200"	)

	@PutMapping("/updatearbitre/{id}")
	public ResponseEntity<arbitres> updatearbitre(@PathVariable(value = "id") Long id,@Valid @RequestBody arbitres arbitresdetails ) { 
		arbitres arbitre=arb.findArbitre(id);
		if(arbitre==null) {
			return ResponseEntity.notFound().build();
		}
arbitre.setNom(arbitresdetails.getNom());
arbitre.setPrenom(arbitresdetails.getPrenom());
arbitre.setMatches(arbitresdetails.getMatches());

arbitres updatearbitre=arb.saveArbitre(arbitre);
return ResponseEntity.ok().body(updatearbitre);

	}
	@CrossOrigin(origins = "http://localhost:4200"	)

	@DeleteMapping("/deletearbitre/{id}")
	 public ResponseEntity<arbitres> DeleteArbitres(@PathVariable(value = "id") Long id){
			arbitres arbitre=arb.findArbitre(id);
		if(arbitre==null) {
			return ResponseEntity.notFound().build();
		}
		arb.delete(arbitre);
		 return ResponseEntity.ok().build();	
	}

}

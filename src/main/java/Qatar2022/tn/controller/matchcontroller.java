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

import Qatar2022.tn.entities.matchs;
import Qatar2022.tn.service.*;

@RestController
@RequestMapping("/api")
public class matchcontroller {

	@Autowired 
	 
	matchservice mat ;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getmatchs")
	public List<matchs> getAllMatchs() {
		List<matchs> match = mat.findAllMatchs();

        return match;
	    
	}
	@PostMapping("/addmatchs") 
	public matchs createMatchs(@Valid @RequestBody matchs match) {
		return mat.saveMatchs(match); 
		}
	@GetMapping("/getmatchs/{id}")
	public ResponseEntity<matchs> getmatchs(@PathVariable(value = "id") Long id) {
		matchs match = mat.findMatchs(id);
if(match==null) {
	return ResponseEntity.notFound().build();
}
        return ResponseEntity.ok().body(match);
	    
	}
	@PutMapping("/updatematchs/{id}")
	public ResponseEntity<matchs> updateMatchs(@PathVariable(value = "id") Long id,@Valid @RequestBody matchs matchsdetails ) { 
		matchs match = mat.findMatchs(id);
		if(match==null) {
			return ResponseEntity.notFound().build();
		}
		match.setStade(matchsdetails.getStade());
		match.setDate(matchsdetails.getDate());
		match.setEquipej(matchsdetails.getEquipej());
		match.setArbitre(matchsdetails.getArbitre());
		
		matchs updateMatchs=mat.saveMatchs(match);
		return ResponseEntity.ok().body(updateMatchs);
		
		}

	@DeleteMapping("/deletematch/{id}")
	 public ResponseEntity<matchs> DeleteMatchs(@PathVariable(value = "id") Long id){
		matchs match = mat.findMatchs(id);
		if(match==null) {
			return ResponseEntity.notFound().build();
		}
		mat.delete(match);
		 return ResponseEntity.ok().build();	
	}


}

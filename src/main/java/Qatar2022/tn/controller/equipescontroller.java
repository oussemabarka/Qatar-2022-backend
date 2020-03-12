package Qatar2022.tn.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/getequipes/{id}")
	public equipes geteEquipes(@PathVariable(value = "id") Long id) {
		equipes equipe = pserv.findEquipes(id);

        return equipe;
	    
	}
	
	    
	}



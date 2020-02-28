package Qatar2022.tn.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		List<equipes> pro = pserv.findAllEquipes();

        return pro;
	    
	}
	
	@PostMapping("/addequipes")
	public equipes createEquipes(@Valid @RequestBody equipes pro) {
	    return pserv.saveEquipes(pro);
	}

}

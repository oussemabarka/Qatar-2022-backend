package Qatar2022.tn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Qatar2022.tn.entities.equipes;
import Qatar2022.tn.entities.matchs;
import Qatar2022.tn.service.*;

@RestController
@RequestMapping("/api")
public class matchcontroller {

	@Autowired 
	 
	matchservice mat ;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getmatch")
	public List<matchs> getAllMatchs() {
		List<matchs> match = mat.findAllMatchs();

        return match;
	    
	}

}

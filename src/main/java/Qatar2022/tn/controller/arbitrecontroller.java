package Qatar2022.tn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Qatar2022.tn.entities.*;
import Qatar2022.tn.service.*;
@RestController
@RequestMapping("/api")
public class arbitrecontroller {
	@Autowired
	arbitreservice arb;
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getjoueurs")
	public List<arbitres> getAllArbitres() {
		List<arbitres> arbitre = arb.findAllArbitre();

        return arbitre;
	    
	}
}

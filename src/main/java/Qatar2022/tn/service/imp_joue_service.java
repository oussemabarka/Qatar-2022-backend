package Qatar2022.tn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Qatar2022.tn.entities.joueurs;
import Qatar2022.tn.entities.matchs;
import Qatar2022.tn.repository.joueurrepository;

@Service
public class imp_joue_service implements joueurservice {

	@Autowired
	joueurrepository jou;
	@Override
public List<joueurs> findAllJoueurs(){
		
		return jou.findAll();
	}
	@Override
	public joueurs saveJoueurs(joueurs joueur) {
		return jou.save(joueur);
		
	}
	@Override
	public joueurs findJoueurs(long id) {
		
		return jou.findById(id).get();
	}
	@Override
	public void delete(joueurs joueur) {
		jou.delete(joueur);
	}
	
}

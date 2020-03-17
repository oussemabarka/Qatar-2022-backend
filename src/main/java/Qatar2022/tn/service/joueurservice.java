package Qatar2022.tn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Qatar2022.tn.entities.joueurs;

@Service
public interface joueurservice {
	List<joueurs> findAllJoueurs();

	joueurs saveJoueurs(joueurs joueur);

	joueurs findJoueurs(long id);
	void delete(joueurs joueur);
}

package Qatar2022.tn.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;



import Qatar2022.tn.entities.*;
@Service
public interface equipeservice {
	List<equipes> findAllEquipes();

	equipes saveEquipes(equipes equipe);

	equipes findEquipes(long id);
	void delete(equipes equipe);

}

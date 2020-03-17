package Qatar2022.tn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Qatar2022.tn.entities.arbitres;;

@Service
public interface arbitreservice {
	List<arbitres> findAllArbitre();

	arbitres saveArbitre(arbitres arbitre);

	arbitres findArbitre(long id);
	void delete(arbitres arbitre);
}

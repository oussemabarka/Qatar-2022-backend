package Qatar2022.tn.service;
import java.util.List;

import org.springframework.stereotype.Service;

import Qatar2022.tn.entities.*;
@Service
public interface equipeservice {
	List<equipes> findAllEquipes();

	equipes saveEquipes(equipes pro);

}

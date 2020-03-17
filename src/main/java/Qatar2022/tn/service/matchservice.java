package Qatar2022.tn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Qatar2022.tn.entities.matchs;;

@Service
public interface matchservice {
	List<matchs> findAllMatchs();

	matchs saveMatchs(matchs match);

	matchs findMatchs(long id);
	void delete(matchs match);
}

package Qatar2022.tn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Qatar2022.tn.entities.matchs;
import Qatar2022.tn.repository.matchsrepository;

@Service
public class imp_match_service implements matchservice {

	@Autowired
	matchsrepository mat;
	@Override
	public List<matchs> findAllMatchs(){
		
		return mat.findAll();
	}
	@Override
	public matchs saveMatchs(matchs match) {
		return mat.save(match);
		
	}
	@Override
	public matchs findMatchs(long id) {
		
		return mat.findById(id).get();
	}
	@Override
	public void delete(matchs match) {
		mat.delete(match);
	}
	
	
}

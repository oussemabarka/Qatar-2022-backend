package Qatar2022.tn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Qatar2022.tn.entities.arbitres;
import Qatar2022.tn.repository.arbitrerepository;

@Service
public class imp_arb_service implements arbitreservice {
	@Autowired
	arbitrerepository arb;
	

	@Override
	public List<arbitres> findAllArbitre() {
		// TODO Auto-generated method stub
		return arb.findAll();
	}

	@Override
	public arbitres saveArbitre(arbitres arbitre) {
		// TODO Auto-generated method stub
		return arb.save(arbitre);
	}
	@Override
	public arbitres findArbitre(long id) {
		// TODO Auto-generated method stub
		return arb.findById(id).get();
	} 
	public void delete(arbitres arbitre)
	{
		arb.delete(arbitre);
		
	}	

	
}

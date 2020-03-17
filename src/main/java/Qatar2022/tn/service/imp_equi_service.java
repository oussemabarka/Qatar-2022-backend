package Qatar2022.tn.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import Qatar2022.tn.entities.equipes;
import Qatar2022.tn.repository.equiperepository;


@Service
public class imp_equi_service implements equipeservice{

	@Autowired
	equiperepository prepo;

	@Override
	public List<equipes> findAllEquipes() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	@Override
	public equipes saveEquipes(equipes equipe) {
		// TODO Auto-generated method stub
		return prepo.save(equipe);
	}
	
	@Override
	public equipes findEquipes(long id) {
		// TODO Auto-generated method stub
		return prepo.findById(id).get();
	} 
	public void delete(equipes equipe)
	{
		prepo.delete(equipe);
		
	}	
	 
}

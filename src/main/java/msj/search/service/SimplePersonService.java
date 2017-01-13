package msj.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import msj.search.dao.SimplePersonRepository;
import msj.search.entity.Person;

@Service
public class SimplePersonService {
	
	@Autowired
	private SimplePersonRepository repository;
	
	public void insert(Person user){
		repository.save(user);
	}
}

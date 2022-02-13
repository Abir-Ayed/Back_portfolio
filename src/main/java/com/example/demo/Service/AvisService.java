package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entities.AvisEntity;
import com.example.demo.Repositories.AvisRepository;

@Service

public class AvisService {

	
	 @Autowired
	    private AvisRepository repository;
	 
	 public AvisEntity saveAvis(AvisEntity avis) {
		 System.out.println(avis);
	        return repository.save(avis);
	    }
	 
	
	 public List<AvisEntity> getAvis() {
	        return repository.findAll();
	    }
	 
	
}

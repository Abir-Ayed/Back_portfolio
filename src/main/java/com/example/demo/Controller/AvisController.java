package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.AvisEntity;
import com.example.demo.Repositories.AvisRepository;
import com.example.demo.Service.AvisService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/")
@ResponseBody
public class AvisController {
	//@Autowired
	//private AvisRepository repository;
	 @Autowired
	    private AvisService service;
	//@GetMapping("avis")
	//public List<AvisEntity> getAvis(){
		
		//return this.repository.findAll();
		
	
	  @PostMapping("/avisAdd")
	    public AvisEntity addAvis( @RequestBody AvisEntity avis) {
	       System.out.println("hello abir ");

	       return service.saveAvis(avis);

	    }
	  @GetMapping("/avis")
		

	    public List<AvisEntity> findAllAvis() {
	      
		  return service.getAvis();
	    }
	}



package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;

@Service
public class outilImpl implements IoutilService {
	@Autowired
	OutilRepository outilRepository;
	@Override
	public Outil addOutil(Outil o) {
		// TODO Auto-generated method stub
		return outilRepository.save(o);
	}

	@Override
	public void deleteOutil(Long id) {
		// TODO Auto-generated method stub
		outilRepository.deleteById(id);
	}

	@Override
	public Outil updateOutil(Outil o) {
		// TODO Auto-generated method stub
			return outilRepository.saveAndFlush(o);
	}

	@Override
	public Outil findOutil(Long id) {
		// TODO Auto-generated method stub
		return outilRepository.findById(id).get();
	}

	@Override
	public List<Outil> findAll() {
		// TODO Auto-generated method stub
		return outilRepository.findAll();
	}

	//@Override
	/*public List<Outil> findByDate(Date d) {
		// TODO Auto-generated method stub
		return outilRepository.findByDate(d);
	}*/

	/*@Override
	public Outil findBySource(String source) {
		// TODO Auto-generated method stub
		return outilRepository.findBySource(source);
	}*/


	

}

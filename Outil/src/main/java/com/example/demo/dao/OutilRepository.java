package com.example.demo.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Outil;

@Repository
public interface OutilRepository extends JpaRepository<Outil,Long> {
	//Outil findBySource(String source);
	//java.util.List<Outil>findByDate (Date Date);

}

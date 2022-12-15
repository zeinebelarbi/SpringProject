package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.service.ImembreService;

@SpringBootApplication
@EnableDiscoveryClient
public class MembreApplication implements CommandLineRunner  {
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	EnseignantChercheurRepository enseignantChercheurtRepository;
@Autowired
ImembreService membreservice;

	public static void main(String[] args) {
		SpringApplication.run(MembreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormatter =new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = dateFormatter.parse("2010-05-01");
		Date date2 = dateFormatter.parse("2019-05-01");
		Date date3 = dateFormatter.parse("2012-05-01");
		Date date4 = dateFormatter.parse("2012-03-01");
		Etudiant etd1= new Etudiant("081705454", "ben fekih", "rim", date1, null, "", "rim@enis.rn", "11111", date1,"these");
		Etudiant etd2= new Etudiant("885705454", "ben ahmed", "sana", date2, null,"",  "sana@enis.rn", "11111",  date2,"mastere");
		Etudiant etd3= new Etudiant("081454", "chaari", "rim",date3, null, "",  "chaari@enis.rn", "11111", date3,"ingénieur");
		etudiantRepository.save(etd1);
		etudiantRepository.save(etd2);
		etudiantRepository.save(etd3);

		EnseignantChercheur ens1=new EnseignantChercheur("082205454", "Walha", "Abedlmajid", date1, null, "", "abdelmajid@enis.rn","12355865","Professeur","ENIS");
		EnseignantChercheur ens2=new EnseignantChercheur("081205454", "rekik", "chokri", date2, null, "", "chokri@enis.rn","12388885","Professeur","ENIS");
		enseignantChercheurtRepository.save(ens1);
		enseignantChercheurtRepository.save(ens2);
		Etudiant e=etudiantRepository.findById(2L).get();
		e.setPrenom("salah");
		etudiantRepository.save(e);
		etudiantRepository.deleteById(2L);
		
		List<Membre> list=membreservice.findAll();
		
		for(Membre m:list)
			System.out.println(m.getNom()+" "+m.getPrenom());
	
		membreservice.affect_Etudiant_to_Enseignant(1L, 4L);
		
	}

}

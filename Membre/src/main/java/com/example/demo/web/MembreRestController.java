package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.service.ImembreService;

@RestController
public class MembreRestController {
@Autowired
ImembreService membreservice;
@RequestMapping(value="/membres", method=RequestMethod.GET)

public List<Membre> findMembres (){
return membreservice.findAll();
}
@GetMapping (value="/membres/{id}")
public Membre findOneMemberById(@PathVariable Long id){
return membreservice.findMember(id);
}
@GetMapping(value="/membres/search/cin")
public Membre findOneMemberByCin(@RequestParam String cin)
{
return membreservice.findByCin(cin);
}
@GetMapping(value="/membres/search/email")
public Membre findOneMemberByEmail(@RequestParam String email)
{
return membreservice.findByEmail(email);
}
@PostMapping(value="/membres/enseignant")
public Membre addMembre(@RequestBody EnseignantChercheur m)
{
return membreservice.addMember(m);
}
@PostMapping(value="/membres/etudiant")
public Membre addMembre(@RequestBody Etudiant e)
{
return membreservice.addMember(e);
}
@DeleteMapping(value="/membres/{id}")
public void deleteMembre(@PathVariable Long id)
{
membreservice.deleteMember(id);
}
}


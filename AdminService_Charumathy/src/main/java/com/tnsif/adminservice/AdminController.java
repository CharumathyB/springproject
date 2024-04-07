package com.tnsif.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class AdminController
{
@Autowired
private AdminService adm;
@GetMapping("/adminservice")
public List<Admin> list()
{
	return adm.ListAll();
}
@PostMapping("/adminservice")
public void add(@RequestBody Admin adm1)
{
	adm.save(adm1);
}
@GetMapping("/adminservice/{id}")
public ResponseEntity<Admin>get(@PathVariable Integer id )
{
	try
	{
	Admin a=adm.get(id);
	
	return new ResponseEntity<Admin>(a,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
		return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
	}
}
@DeleteMapping("/adminservice/{id}")
public void delete(@PathVariable Integer id)
{
	adm.delete(id);
	
}
@PutMapping("/adminservice/{id}")
public ResponseEntity<Admin> update(@PathVariable Integer id,@RequestBody Admin update_a)
{
	try
	{
	Admin exist_a=adm.get(id);
	exist_a.setName(update_a.getName());
	exist_a.setContactno(update_a.getContactno());
	exist_a.setDept(update_a.getDept());
	exist_a.setYear(update_a.getYear());
	adm.update(exist_a);
	
	
	return new ResponseEntity<Admin>(exist_a,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
		return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
	}
}
}

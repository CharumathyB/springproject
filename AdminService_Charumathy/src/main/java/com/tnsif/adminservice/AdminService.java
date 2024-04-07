package com.tnsif.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService 
{
@Autowired
	private AdminRepository repo;
public List<Admin> ListAll()
{
	return repo.findAll();
}
public void save(Admin adm)
{
	repo.save(adm);
}
public Admin get(Integer id)
{
	return repo.findById(id).get();
}
public void delete(Integer id)
{
	repo.deleteById(id);
}
public void update(Admin adm)
{
	repo.save(adm);
}
}

package com.shopnpay.admin.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopnpay.admin.exception.ResourceNotFoundException;
import com.shopnpay.admin.model.Admin;
import com.shopnpay.admin.repository.AdminRepository;



@CrossOrigin(origins = "http://localhost:3000/")
@Transactional
@RestController
@RequestMapping("api/")
public class AdminController {
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	//get all admins
	@GetMapping("admin")
	public List<Admin> getAllAdmin(){
		return adminRepository.findAll();
	}

	//add new admin
	@PostMapping("admin")
	public Admin createAdmin(@RequestBody Admin admin){
		return adminRepository.save(admin);
	}
	
	
	
	//get admin by id rest api
	@GetMapping("admin/{id}")
	public Admin getAdminById(@PathVariable int id){
		return adminRepository.findById(id);
		
	}
	
	//update admin rest api
	@PutMapping("admin/{id}")
	public Admin updateAdmin(@PathVariable int id,@RequestBody Admin adminDetails) {
		Admin admin = adminRepository.findById(id);
		admin.setUsername(adminDetails.getUsername());
		admin.setEmpid(adminDetails.getEmpid());
		admin.setEmail(adminDetails.getEmail());
		admin.setMobile(adminDetails.getMobile());
		Admin updatedAdmin = adminRepository.save(admin);
		return updatedAdmin;
	}
	
	//delete admin rest api
	@DeleteMapping("admin/{id}")
	public String deleteAdmin(@PathVariable int id) {
		adminRepository.deleteById(id);
		return "Admin deleted with id : "+id;
	}
	
	
	//delete seleted multiple id rest api
	@DeleteMapping("deleteAllById")
	public String deleteAllById(@RequestBody List<Integer> ids) {
		adminRepository.deleteByIdIn(ids);
		return "Admin deleted successfully!";
	}
	
}

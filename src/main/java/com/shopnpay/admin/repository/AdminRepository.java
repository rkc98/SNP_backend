package com.shopnpay.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopnpay.admin.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

	Admin findById(int id);

	void deleteById(int id);

	void deleteByIdIn(List<Integer> ids);

	
}

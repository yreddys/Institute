package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.InstituteEntity;

@Repository
public interface InstituteRepository extends JpaRepository <InstituteEntity,Integer>{
	
}
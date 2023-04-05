package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InstituteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private int tier;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public InstituteEntity(int id, String name, int tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	
	InstituteEntity(){
		
	}
	@Override
	public String toString() {
		return "InstituteEntity [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}
	
	
	
	

}

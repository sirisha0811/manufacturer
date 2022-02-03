package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
public class Component {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer component_id;
	@NotBlank
	@NotEmpty
	@Size(max=25)
	public String name;
	
	@NotBlank
	@Size(max=100)
	public String description;
	public String suppliers;
	public Integer getComponent_id() {
		return component_id;
	}
	public void setComponent_id(Integer component_id) {
		this.component_id = component_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(String suppliers) {
		this.suppliers = suppliers;
	}
	

}

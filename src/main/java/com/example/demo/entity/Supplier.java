package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer supplier_id;
	
	public Integer getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	@NotNull
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z\\s]+$")
	private String supplier_name;
	
	@ManyToMany(mappedBy = "suppliers", cascade = {
			CascadeType.MERGE,
			CascadeType.PERSIST
	}, fetch = FetchType.LAZY)
	private Set<Component> components;

	public Supplier() {
		
	}

	public Supplier(Integer supplier_id, @NotNull @NotBlank @Pattern(regexp = "^[A-Za-z]+$") String supplier_name,
			Set<Component> components) {
		super();
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.components = components;
	}
	
	

	public Set<Component> getComponents() {
		return components;
	}

	public void setComponents(Set<Component> components) {
		this.components = components;
	}

}
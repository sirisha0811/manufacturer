package com.example.demo.entity;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	public String product_name;
	public String getProduct_name() {
		return product_name;
	}
	// @ManyToOne(fetch = FetchType.LAZY, optional = false)
     //@JoinColumn(name = "product_id", nullable = false)
	@OneToOne(mappedBy ="component")
 
     @ManyToOne(fetch = FetchType.LAZY, optional = false)
     @JoinColumn(name = "product_id", nullable = false)
     Product product;
	 
	 
	 
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
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
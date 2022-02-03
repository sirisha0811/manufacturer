package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Component;
import com.example.demo.repository.ComponentRepository;
@Service
public class ComponentService {
	@Autowired
	ComponentRepository componentRepository;

	public Iterable<Component> getComponents() {
		return componentRepository.findAll();
	}

	public Optional<Component> getcomponent(Integer id) {
		return componentRepository.findById(id);
	}

	public void saveComponent(@Valid Component component) {
		componentRepository.save(component);
		
	}

}

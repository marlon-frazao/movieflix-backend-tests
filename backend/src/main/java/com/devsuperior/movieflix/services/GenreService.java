package com.devsuperior.movieflix.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.services.exception.ResourceNotFoundException;

@Service
public class GenreService {

	@Autowired
	private GenreRepository repository;
	
	@Transactional
	public List<GenreDTO> findAll() {
		return repository.findAll().stream().map(x -> x.toDto()).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public GenreDTO findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not found")).toDto();
	}
}

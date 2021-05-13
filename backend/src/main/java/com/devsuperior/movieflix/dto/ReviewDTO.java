package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO {

	private Long id;
	private String text;
	
	private UserDTO user;
	private MovieDTO movie;
	
	public ReviewDTO() {}

	public ReviewDTO(Long id, String text, UserDTO user, MovieDTO movie) {
		this.id = id;
		this.text = text;
		this.user = user;
		this.movie = movie;
	}
	
	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();
		user = entity.getUser().toDto();
		movie = entity.getMovie().toDto();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public MovieDTO getMovie() {
		return movie;
	}

	public void setMovie(MovieDTO movie) {
		this.movie = movie;
	}
}

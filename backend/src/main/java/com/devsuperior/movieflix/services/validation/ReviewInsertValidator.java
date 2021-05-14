package com.devsuperior.movieflix.services.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.devsuperior.movieflix.dto.ReviewDTO;

public class ReviewInsertValidator implements ConstraintValidator<ReviewInsertValid, ReviewDTO>{
	
	@Override
	public void initialize(ReviewInsertValid ann) {
	}
	
	@Override
	public boolean isValid(ReviewDTO dto, ConstraintValidatorContext context) {

		boolean valid = false;
		if(!dto.getText().equals("")) {
			valid = true;
		}
		return valid;
	}

}

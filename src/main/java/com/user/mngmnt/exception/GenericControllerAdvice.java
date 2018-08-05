package com.user.mngmnt.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GenericControllerAdvice {

	@ExceptionHandler(Exception.class)
	public String assertionException(final Exception e) {
		e.printStackTrace();
		return "redirect:/login?error=Something went wrong";
	}

}

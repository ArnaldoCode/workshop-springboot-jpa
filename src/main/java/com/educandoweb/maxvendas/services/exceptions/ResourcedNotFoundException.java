package com.educandoweb.maxvendas.services.exceptions;



public class ResourcedNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourcedNotFoundException(Long id) {
		super ("Resource Not Found. id " + id);
	}
}

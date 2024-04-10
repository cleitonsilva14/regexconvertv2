package io.convert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.convert.service.ConversorService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ConversorController {

	@Autowired
	private ConversorService conversorService;
	
	@Operation(summary = "Converter um número de série para um padrão regex", tags = "Conversor")
	@GetMapping("/conversor/{numSerie}")
	public ResponseEntity<String> convert(@PathVariable String numSerie) {
		return ResponseEntity.ok(conversorService.converter(numSerie));
	}
	
}

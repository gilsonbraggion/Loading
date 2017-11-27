package br.com.rhinosistemas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class LoadingController {
	
	
	@GetMapping(value="/")
	public String paginaInicial() {
		
		
		return "paginaInicial";
	}
}

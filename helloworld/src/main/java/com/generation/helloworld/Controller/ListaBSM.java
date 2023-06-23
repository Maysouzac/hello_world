package com.generation.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listabsm")

public class ListaBSM {
	@GetMapping
	public String listabsm() {
	return "Responsabilidade Pessoal, Mentalidade de Crescimento, Orientação ao Futuro, Persistência, Comunicação, Trabalho em equipe, Proatividade e Orientação ao detalhe ";
	}

}

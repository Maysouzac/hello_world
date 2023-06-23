package com.generation.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listaobjetivo")

public class ListaObjetivo {

	@GetMapping
	public String listaobjetivo() {
	return "Finalizar as atividades porpostas na semana e absorver todo conteudo, conciliar as tarefas de casa com o bootcamp.";
	}
	
}

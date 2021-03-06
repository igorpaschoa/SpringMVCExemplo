package br.com.treinaweb.springmvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.treinaweb.springmvc.dominios.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmesController {
	
	@RequestMapping(path = "/adicionar", method = RequestMethod.GET)
	public String adicionar(Model model) {
		model.addAttribute("filme", new Filme());
		return "filmes/adicionar";
	}
	
	@RequestMapping(path = "/adicionar", method = RequestMethod.POST)
	public String adicionar(Model model, @ModelAttribute("filme") @Valid Filme filme, BindingResult result) {
		if (result.hasErrors()) {
			return "filmes/adicionar";
		}
		model.addAttribute("filme", filme);
		return "filmes/exibir";
	}

}

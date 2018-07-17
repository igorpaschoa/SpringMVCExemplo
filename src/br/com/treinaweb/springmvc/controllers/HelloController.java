package br.com.treinaweb.springmvc.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	// <servidor>/hello/message
	@RequestMapping("/message")
	public String message() {
		return "hello";
	}
	
	// passar info servidor -> cliente, modo 1
	@RequestMapping("/mensagemDoServidor")
	public String mensagemDoServidor(Model model) {
		model.addAttribute("mensagem", new Date().toString());		
		return "mensagemDoServidor";
	}
	
	// passar info servidor -> cliente, modo 2
	@RequestMapping("/mensagemDoServidor2")
	public ModelAndView mensagemDoServidorV2() {
		return new ModelAndView("mensagemDoServidor", "mensagem", new Date().toString());
	}
	
	// passar info cliente -> servidor, modo 1
	@RequestMapping("/receberMensagem/{mensagem}")
	public String receberMensagem(Model model, @PathVariable("mensagem") String msg) {
		model.addAttribute("mensagem", msg);
		return "mensagemDoServidor";
	}
}

package br.com.LeonardoMatheus.controller;

import org.apache.catalina.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SegurancaController {
	
	@RequestMapping("/login")
	public String login (@AuthenticationPrincipal User user){
		if (user != null) {
			return "redirect:/atleta/novo";
		}
		
		return "acesso";
	}

}
package com.serjer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.serjer.model.Generator;
import com.serjer.repo.GeneratorRepo;
import com.serjer.service.GeneratorService;

@Controller
public class MainController {

	@Autowired
	private GeneratorService generatorService;

	@Autowired
	private GeneratorRepo generatorRepo;

	@GetMapping("/")
	public String main(Model model) {
		return "input";
	}

	@PostMapping("/")
	public String inputNumbers(Model model, @RequestParam long number1, @RequestParam long number2) {
		Generator generator = generatorRepo.getGeneratorList().get(0);
		long matches = generatorService.calculateMatches(number1, number2, generator);
		model.addAttribute("matches", matches);
		return "input";
	}
	
	@GetMapping("/settings")
	public String displayGeneratorSettings(Model model) {
		Generator generator = generatorRepo.getGeneratorList().get(0);
		model.addAttribute("generator", generator);
		return "settings";
	}
	
	@PostMapping("/settings")
	public String updateGeneratorSettings(Model model, @ModelAttribute Generator generator) {
		generatorRepo.getGeneratorList().clear();
		generatorRepo.getGeneratorList().add(generator);
		return "redirect:/settings";
	}
}
package com.aysimasavas.quizapplication.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aysimasavas.quizapplication.entities.MathResponse;

@RestController
@RequestMapping("/api/math")
public class MathController {

	@GetMapping("/add")
	public MathResponse generateAddition(@RequestParam("min") int min, @RequestParam("max") int max) {
		return null;
	}

	@GetMapping("/subs")
	public MathResponse generateSub(@RequestParam("min") int min, @RequestParam("max") int max,
			@RequestParam("negative") boolean isNegative) {
		return null;
	}

	@GetMapping("/multiply")
	public MathResponse generateMultiplication(@RequestParam("min") int min, @RequestParam("max") int max) {
		return null;
	}

	@GetMapping("/div")
	public MathResponse generateDivision(@RequestParam("min") int min, @RequestParam("max") int max) {
		return null;
	}

}

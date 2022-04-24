package com.aysimasavas.quizapplication.api;

import org.springframework.web.bind.annotation.*;

import com.aysimasavas.quizapplication.business.GeneratorService;
import com.aysimasavas.quizapplication.entities.MathResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/math")
public class MathController {

    private final GeneratorService service = new GeneratorService();

    private final int defaultMax = 99;
    private final int defaultMin = 1;

    @GetMapping("/add")
    public MathResponse generateAddition(@RequestParam(value = "min", required = false) Integer min,
                                         @RequestParam(value = "max", required = false) Integer max) {
        if (min == null) {
			min = defaultMin;
		}
        if (max == null) {
			max = defaultMax;
		}
        return service.generateAdd(max, min);
    }

    @GetMapping("/subs")
	public MathResponse generateSub(@RequestParam(value = "min", required = false) Integer min,
			@RequestParam(value = "max", required = false) Integer max,
			@RequestParam(value = "negative", required = false) Boolean isNegative) {
		if (min == null) {
			min = defaultMin;
		}
		if (max == null) {
			max = defaultMax;
		}
		if (isNegative == null) {
			isNegative = false;
		}
        return service.generateSub(max, min, isNegative);
    }

    @GetMapping("/multiply")
	public MathResponse generateMultiplication(@RequestParam(value = "min", required = false) Integer min,
			@RequestParam(value = "max", required = false) Integer max) {
		if (min == null) {
			min = defaultMin;
		}
		if (max == null) {
			max = defaultMax;
		}
        return service.generateMultiply(max, min);
    }

    @GetMapping("/div")
	public MathResponse generateDivision(@RequestParam(value = "min", required = false) Integer min,
			@RequestParam(value = "max", required = false) Integer max) {
		if (min == null) {
			min = defaultMin;
		}
		if (max == null) {
			max = defaultMax;
		}
        return service.generateDiv(max, min);
    }

}

package com.aysimasavas.quizapplication.api;

import com.aysimasavas.quizapplication.business.GeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aysimasavas.quizapplication.entities.MathResponse;

import java.util.Optional;

@RestController
@RequestMapping("/api/math")
public class MathController {

    private final GeneratorService service = new GeneratorService();

    private final int defaultMax = 99;
    private final int defaultMin = 1;

    @GetMapping("/add")
    public MathResponse generateAddition(@RequestParam(value = "min", required = false) Integer min,
                                         @RequestParam(value = "max", required = false) Integer max) {
        if (min == null) min = defaultMin;
        if (max == null) max = defaultMax;
        return service.generateAdd(max, min);
    }

    @GetMapping("/subs")
    public MathResponse generateSub(@RequestParam("min") int min, @RequestParam("max") int max,
                                    @RequestParam("negative") boolean isNegative) {
        return service.generateSub(max, min, isNegative);
    }

    @GetMapping("/multiply")
    public MathResponse generateMultiplication(@RequestParam("min") int min, @RequestParam("max") int max) {
        return service.generateMultiply(max, min);
    }

    @GetMapping("/div")
    public MathResponse generateDivision(@RequestParam("min") int min, @RequestParam("max") int max) {
        return service.generateDiv(max, min);
    }

}

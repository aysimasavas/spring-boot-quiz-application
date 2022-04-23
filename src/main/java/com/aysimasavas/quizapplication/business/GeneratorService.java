package com.aysimasavas.quizapplication.business;

import org.springframework.stereotype.Service;

import com.aysimasavas.quizapplication.entities.MathResponse;
import com.aysimasavas.quizapplication.utils.GeneratorUtils;

@Service
public class GeneratorService implements IGeneratorService {
    @Override
    public MathResponse generateAdd(int max, int min) {
        int first = GeneratorUtils.generateRandomNumber(max, min);
        int second = GeneratorUtils.generateRandomNumber(max, min);
        String operation = "+";
        int result = first + second;
        String expression = String.format("%d %s %d", first, operation, second);
        return new MathResponse(first, second, operation, expression, result);
    }

    @Override
    public MathResponse generateSub(int max, int min, boolean negative) {
		int first = GeneratorUtils.generateRandomNumber(max, min);
		int second = GeneratorUtils.generateRandomNumber(max, min);
		if (second > first && !negative) {
			int temp = second;
			second = first;
			first = temp;
		}
		String operation = "-";
		int result = first - second;
		String expression = String.format("%d %s %d", first, operation, second);
		return new MathResponse(first, second, negative, operation, expression, result);
    }

    @Override
    public MathResponse generateMultiply(int max, int min) {
		int first = GeneratorUtils.generateRandomNumber(max, min);
		int second = GeneratorUtils.generateRandomNumber(max, min);
		String operation = "*";
		int result = first * second;
		String expression = String.format("%d %s %d", first, operation, second);
		return new MathResponse(first, second, operation, expression, result);
    }

    @Override
    public MathResponse generateDiv(int max, int min) {
		int first = GeneratorUtils.generateRandomNumber(max, min);
		int second = GeneratorUtils.generateRandomNumber(max, min);
		String operation = "/";
		double result = first / second;
		String expression = String.format("%d %s %d", first, operation, second);
		return new MathResponse(first, second, operation, expression, result);
    }

    @Override
    public MathResponse generateRandom(int max, int min, boolean negative) {
        return null;
    }
}

package com.aysimasavas.quizapplication.business;

import com.aysimasavas.quizapplication.entities.MathResponse;
import com.aysimasavas.quizapplication.utils.GeneratorUtils;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public MathResponse generateMultiply(int max, int min) {
        return null;
    }

    @Override
    public MathResponse generateDiv(int max, int min) {
        return null;
    }

    @Override
    public MathResponse generateRandom(int max, int min, boolean negative) {
        return null;
    }
}

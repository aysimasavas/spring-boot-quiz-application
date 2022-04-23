package com.aysimasavas.quizapplication.business;

import com.aysimasavas.quizapplication.entities.MathResponse;
import org.springframework.lang.Nullable;


public interface IGeneratorService {
    MathResponse generateAdd(int max, int min);

    MathResponse generateSub(int max, int min, boolean negative);

    MathResponse generateMultiply(int max, int min);

    MathResponse generateDiv(int max, int min);

    MathResponse generateRandom(int max, int min, @Nullable boolean negative);

}

package com.aysimasavas.quizapplication.entities;


public class MathResponse {

    private int firstNum;
    private int secondNum;
    private boolean isNegative;
    private String operation;
    private String expression;
	private double result;

    public MathResponse(int firstNum, int secondNum, boolean isNegative, String operation, String expression,
                        float result) {
        super();
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.isNegative = isNegative;
        this.operation = operation;
        this.expression = expression;
        this.result = result;
    }

    public MathResponse() {

    }

    public MathResponse(int firstNum, int secondNum, String operation, String expression, int result) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;
        this.expression = expression;
        this.result = result;
    }

	public MathResponse(int firstNum, int secondNum, String operation, String expression, double result) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.operation = operation;
		this.expression = expression;
		this.result = result;
	}

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public boolean isNegative() {
        return isNegative;
    }

    public void setNegative(boolean isNegative) {
        this.isNegative = isNegative;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}


}

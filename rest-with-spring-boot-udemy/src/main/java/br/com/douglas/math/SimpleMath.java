package br.com.douglas.math;

public class SimpleMath {
	
	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double sub(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double mult(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}

	public Double div(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double avg(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber)/2;
	}
	
	public Double raiz(Double number) {
		return (Double) Math.sqrt(number);
	}
}

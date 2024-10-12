public class CalculatorBrain {
	public static void main(String[] args) {
		CalculatorBrain calc = new CalculatorBrain();
		
		double sum = calc.addiction(12.22, 44.67);
		int sumInt = calc.addiction(14, 28);
		System.out.println("El resultado de la suma es: " + String.format("%.2f", sum));
		System.out.println("El resultado de la suma de enteros es: " + sumInt);
		double rest = calc.subtraction(22.22, 9.87);
		int restInt = calc.subtraction(98, 34);
		System.out.println("El resultado de la resta es: " + rest);
		System.out.println("El resultado de la resta de enteros es: " + restInt);
		double mult = calc.multiplication(20.14, 11.05);
		double multInt = calc.multiplication(20, 22);
		System.out.println("El resultado de la multiplicación es: " + String.format("%.2f", mult));
		System.out.println("El resultado de la multiplicación de enteros es: " + multInt);
		double div = calc.division(34.4, 7.14);
		double divInt = calc.division(20, 22);
		System.out.println("El resultado de la división es: " + div);
		System.out.println("El resultado de la división de enteros es: " + divInt);
		double raiz = calc.squareRoot(20);
		System.out.println("El resultado de la raíz cuadrada es: " + raiz);
		double potencia = calc.powerOf(9,2);
		System.out.println("El resultado de la potencia es: " + potencia);
		
		
	}//main

	
	public double addiction(double a, double b) {
		double resultado = a + b;
		return resultado;
	}//addiction double
	public int addiction(int a, int b) {
		int resultado = a + b;
		return resultado;
	}//addiction int
	public double subtraction(double a, double b) {
		double resultado = a - b;
		return resultado;
	}//subtraction double
	public int subtraction(int a, int b) {
		int resultado = a - b;
		return resultado;
	}//subtraction int
	public double multiplication(double a, double b) {
		double resultado = a * b;
		return resultado;
	}//multiplication double
	public int multiplication(int a, int b) {
		int resultado = a * b;
		return resultado;
	}//multiplication int
	public double division(double a, double b) {
		double resultado = a / b;
		return resultado;
	}//division double
	public int division(int a, int b) {
		int resultado = a / b;
		return resultado;
	}//division int
	public double squareRoot(double a) {
		double resultado = Math.sqrt(a);
		return resultado;
	}//squareRoot
	public double powerOf(double base, double expont) {
		double resultado = Math.pow(base, expont);
		return resultado;
	}//powerOf
	
	
}//class CalculatorBrain

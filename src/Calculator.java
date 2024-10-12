public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double res = calc.sum(25, 15, 66);
		System.out.println("sum result: " + res);
//		res = calc.subtract(181, 97);
//		System.out.println("subtract result: " + res);
//		calc.operations(25,15);
		
		float result = calc.divide(99.7F,4);
		System.out.println("Result division: " + result);
		System.out.println("Result multiply: " + Calculator.multiply(3.1415926, 2.5));
	}//main
	
	public int sum(int a, int b) {
		System.out.println("Suma dos enteros");
		int c = a + b; 
		return c;
	}//sum
	public double sum(double a, double b) {
		System.out.println("Suma dos double");
		double c = a + b; 
		return c;
	}//sum
	public int sum(int a, int b, int c) {
		System.out.println("Suma tres enteros");
		int d = a + b + c; 
		return d;
	}//sum
	public float divide(float x, float y) {
		return x / y;
	}//divide
	public int subtract(int a, int b) {
		return a - b;
	}//subtract
	//Método de clase, se accede mediante la clase Calculator.multiply(x,y);
	public static double multiply(double x, double y) {
		return x * y;
	}//multiply
	public void operations(int x, int y) {
		System.out.println(sum(x,y));
		System.out.println(subtract(x,y));
	}//operations
}//class Calculator

package exercicio07;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		calcular(5,5);
		calcular(10.27, 10.42);
		calcular("Vinicius ","Almeida");

	}
	//Somar valores
	private void calcular(int primeiroValor, int segundoValor) {
		int resultado = primeiroValor + segundoValor;
		System.out.println("Resultado da operação: " + resultado);
	}
	//Subtratir valores
	private void calcular(double primeiroValor, double segundoValor) {
		double resultado = primeiroValor - segundoValor;
		System.out.println("Resultado da operação: " + resultado);
	}
	//Concatenar dois valores
	private void calcular(String primeiroValor,String segundoValor) {
		String resultado = primeiroValor + segundoValor;
		System.out.println("Resultado da operação: : " + resultado);

	}

}

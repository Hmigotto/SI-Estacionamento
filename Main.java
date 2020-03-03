import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//vamos instanciar um objeto da classe Scanner
		
		//Metodo construtor, que tem um parametro
		Scanner teclado = new Scanner(System.in);
		
		//Depois do new se cria o construtor, que constroi um espaço na memoria
		Paciente paciente = new Paciente();
		
		System.out.println("Escreva seu nome");
		paciente.nome = teclado.nextLine();
		
		System.out.println("Escreva sua idade");
		paciente.idade = teclado.nextInt();
		
		
		//saida de dados
		System.out.println("\nNome: "+paciente.nome);
		System.out.println("Idade: "+paciente.idade);
		System.out.println("Frequencia cardieca Maxima: "+paciente.calcularFrequenciaMaxima());
		System.out.println("Alvo Maximo: "+paciente.calcularAlvoMaximo());
		System.out.println("Alvo Minimo: "+paciente.calcularAlvoMinima());
		
		//fechar o objeto para não ocupar um grande espaço na memoria
		teclado.close();
	}
}


public class Paciente {
	
	//atributo ou propriedade ou variavel de instancia (Instancia � sinonimo de Objeto)
	
	String nome;
	int idade;
	
	
	//metodo � uma a��o, esta sempre relacionado a um verbo, calcular alguma coisa
	//o metodo calcula coisas de quem ? se for do paciente ele fica dentro do paciente
	

	//Static significa que n�o tem objeto
	
	

	//VOID, n�o retorna valor
	//Int ou Double pode ser dado a uma Public, pois isso � o valor que ela retorna
	//Existe public e privado, depois o professor vai falar disso.
	
	
	//Um parametro serve para receber alguma coisa que esta fora desse arquivo ou classe.
	
	
	//metodo para calcular a frequencia maxima
	public int calcularFrequenciaMaxima() {
		return 220-idade;
	}
	
	//metodo para calcular a frequencia minima
	public double calcularAlvoMinima() {
		return calcularFrequenciaMaxima()*0.5;
	}
	
	//metodo para calcular a frequencia alvo maximo
	public double calcularAlvoMaximo() {
		return calcularFrequenciaMaxima()*0.85;
	}
	
	
	
}

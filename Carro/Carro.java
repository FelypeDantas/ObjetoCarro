package Carro;

public class Carro {

	String modelo;
	int VelocidadeMaxima;
	double SegundosZeroacem;
	
	Carro(){
		this("",0,0.0);
	}
	
	public Carro(String mo, int ve, double seg) {
		modelo = mo;
		VelocidadeMaxima = ve;
		SegundosZeroacem = seg;
	}
}

package es02;

public class Rettangolo {
	
	//lista attributi
	
	int altezza;
	int larghezza;
	
	//lista costruttori
	
	public Rettangolo(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	//lista metodi
	
	int area() {
		return altezza*larghezza;
	}
	
	int perimetro() {
		return (altezza*larghezza)*2;
	}

}

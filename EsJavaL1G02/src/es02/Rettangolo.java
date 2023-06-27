package es02;

public class Rettangolo {
	
	
	// Lista attributi
	int altezza;
	int larghezza;

	//Costruttore
	
	public Rettangolo(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	//Metodi
	
	public int perimetro() {
		return ((altezza+larghezza)*2);
	}
	
	public int area() {
		return (altezza*larghezza); 
	}
	
	
}

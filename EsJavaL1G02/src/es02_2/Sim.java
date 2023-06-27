package es02_2;

import java.util.Arrays;

public class Sim {
	
	//attributi
	
	int numeroDiTelefono;
	int credito;
	String[] listaChiamate;
	
	//costruttore
	
	public Sim (int numeroDiTelefono, int credito, String[] listaChiamate) {
		this.numeroDiTelefono = numeroDiTelefono;
		this.credito = credito;
		this.listaChiamate = listaChiamate;
	}
	
	//metodi
	
	void datiSim () {
		 System.out.println(numeroDiTelefono + " " + credito);
	        System.out.println("Lista Chiamate:");
	        System.out.println(Arrays.toString(listaChiamate));
		
	}
	

}

package es02;

public class RettangoliMain {

	public static void main(String[] args) {
		
		Rettangolo primo = new Rettangolo(5, 4);
		System.out.println(primo.perimetro());
		System.out.println(primo.area());
		
		Rettangolo secondo = new Rettangolo(8, 12);
		System.out.println(secondo.perimetro());
		System.out.println(secondo.area());
		
		Rettangolo terzo = new Rettangolo(12, 25);
		System.out.println(terzo.perimetro());
		System.out.println(terzo.area());
		
		stampaRettangolo(primo);
		
		stampaDueRettangoli(secondo, terzo);

		
	}
	
	public static void stampaRettangolo(Rettangolo primo) {
		System.out.println(primo.area());
		System.out.println(primo.perimetro());
		
	}
	
	public static void stampaDueRettangoli(Rettangolo secondo, Rettangolo terzo) {
		int primoPerimetro = secondo.perimetro();
		int secondoPerimetro = terzo.perimetro();
		int primaArea = secondo.area();
		int secondaArea = terzo.area();
		int somma = (primoPerimetro + secondoPerimetro + primaArea + secondaArea);
		
		System.out.println(somma);
		
		
	}

}

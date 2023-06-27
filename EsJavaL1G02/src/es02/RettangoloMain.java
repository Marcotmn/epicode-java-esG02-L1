package es02;

public class RettangoloMain {
	
public static void main(String[] args) {
	Rettangolo primoRettangolo = new Rettangolo (4,7);
	Rettangolo secondoRettangolo = new Rettangolo (7,2);
	Rettangolo terzoRettangolo = new Rettangolo (3,8);
	
	stampaRettangolo(primoRettangolo);
	stampaDueRettangoli(secondoRettangolo, terzoRettangolo);
	
}

public static void stampaRettangolo(Rettangolo primoRettangolo) {
	System.out.println(primoRettangolo.area());
	System.out.println(primoRettangolo.perimetro());

	
}

public static void stampaDueRettangoli(Rettangolo secondoRettangolo, Rettangolo terzoRettangolo) {
	System.out.println(secondoRettangolo.area());
	System.out.println(secondoRettangolo.perimetro());
	System.out.println(terzoRettangolo.area());
	System.out.println(terzoRettangolo.perimetro());
	System.out.println(secondoRettangolo.area()+terzoRettangolo.area()+secondoRettangolo.perimetro()+terzoRettangolo.perimetro());
}

		
}

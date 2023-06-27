package es02_2;

public class SimMain {

public static void main(String[] args) {
	 String[] listaChiamate = new String[5];
     listaChiamate[0] = "Telefonata 1: 327912245 7m";
     listaChiamate[1] = "Telefonata 2: 327912374 45s";
     listaChiamate[2] = "Telefonata 3: 327912393 10m";
     listaChiamate[3] = "Telefonata 4: 327932393 12m";
     listaChiamate[4] = "Telefonata 5: 327912243 30s";

     Sim miaSim = new Sim(328594634, 45, listaChiamate);

     stampaDatiSim(miaSim);
 }
	 public static void stampaDatiSim (Sim miaSim) {
	 miaSim.datiSim();
}

	
}

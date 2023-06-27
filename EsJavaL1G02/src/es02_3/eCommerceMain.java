package es02_3;

public class eCommerceMain {

	public static void main(String[] args) {
		eCommerce articoloUno = new eCommerce(1, "Smartphone android", 159, 45);
		eCommerce articoloDue = new eCommerce(2, "smartv", 399, 59);
		eCommerce articoloTre = new eCommerce(3, "PC portatile", 799, 100);
		
		eCommerce cliente = new eCommerce(1, "Marco", "Tumminia", "marco@tumminia.com", 171320);
		
		String[] carrelloCliente = {articoloUno.descrizioneArticolo, articoloDue.descrizioneArticolo, articoloTre.descrizioneArticolo};
		int costoTotaleCliente = articoloUno.prezzo+ articoloDue.prezzo + articoloTre.prezzo;
		
		cliente.clienteAssociato = cliente.codiceCliente;
		cliente.elencoArticoli = carrelloCliente;
		cliente.costoTotale = costoTotaleCliente;
		
		System.out.println("Dettagli dell'ordine:");
	    System.out.println("Cliente: " + cliente.nome + " " + cliente.cognome);
	    System.out.println("Email: " + cliente.email);
	    System.out.println("Data iscrizione: " + cliente.dataIscrizione);
	    System.out.println("Articoli nel carrello:");
	    
	    for (String articolo : cliente.elencoArticoli) {
	    	System.out.println(" " + articolo);
	    }
	    
	    System.out.println("Costo totale: " + cliente.costoTotale);
	}

	

}

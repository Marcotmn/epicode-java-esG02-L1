package es02_3;

public class eCommerce {
	
	// attributi
	int codiceArticolo;
	String descrizioneArticolo;
	int prezzo;
	int disponibilità;
	int codiceCliente;
	String nome;
	String cognome;
	String email;
	int dataIscrizione;
	int clienteAssociato;
	String[] elencoArticoli;
	int costoTotale;
	
	
	// costruttore articolo
	eCommerce (int codiceArticolo, String descrizioneArticolo, int prezzo, int disponbilità) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.disponibilità = disponbilità;
	}
	
	public eCommerce (int codiceCliente, String nome, String cognome, String email, int dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}
	
	public eCommerce (int clienteAssociato, String[] elencoArticoli, int costoTotale) {
		this.clienteAssociato = clienteAssociato;
		this.elencoArticoli = elencoArticoli;
		this.costoTotale = costoTotale;
	}
	
	
	
}

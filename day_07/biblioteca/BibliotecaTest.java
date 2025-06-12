package day_07.biblioteca;

import java.time.LocalDateTime;
import java.util.HashMap;

public class BibliotecaTest {

	public static void main(String[] args) {
		HashMap<String, Boolean> autori = new HashMap<>();
		// String partitaIva, String nome, String indirizzo
		Editore mondadori = new Editore("12345678900", "Arnoldo Mondadori Editore S.p.A.",
				"Via Arnoldo Mondadori, 1, 20054 Segrate (MI), Italia");
		// String isbn, String titolo, HashMap<String, Boolean> autori, Editore
		// casaeditrice
		Libro ilVecchioeIlMare = new Libro("isbn1", "Il vecchio e il mare",
				autori.put("Ernest Hemingway", true), mondadori);
		String risposta = ArchivioController.nuovoLibro(ilVecchioeIlMare);
		System.out.println(risposta);
		
		//String cf, String nome, String cognome
		Abbonato paoloRossi = new Abbonato("CF1", "Paolo", "Rossi");
		String rispostaAbbonato = ArchivioController.nuovoAbbonato(paoloRossi);
		System.out.println(rispostaAbbonato);
		autori.put("Daniela Pellacani", true);
		autori.put("Stefano Verziaggi", false);
		Libro ilRaccontoRealisticoconilWRW = new Libro("isbn2", "ilRaccontoRealisticoconilWRW",
				autori, mondadori);
		//Abbonato abbonato, Libro libro, LocalDateTime dataPrestito
	//	Prestito prestito1 = new Prestito(paoloRossi, ilVecchioeIlMare, LocalDateTime.now());
	//	Prestito prestito2 = new Prestito(paoloRossi, ilRaccontoRealisticoconilWRW, LocalDateTime.now());
		String rispostaPrestito1 = ArchivioController.prestito(paoloRossi, ilRaccontoRealisticoconilWRW, LocalDateTime.now());
		String rispostaPrestito2 = ArchivioController.prestito(paoloRossi, ilVecchioeIlMare, LocalDateTime.now());
		System.out.println(rispostaPrestito1);
		System.out.println(rispostaPrestito2);
		System.out.println("numero libri in presito: " + ArchivioController.libriInPrestito());
		String rispostaRestituzione1 = ArchivioController.restituzione(paoloRossi, ilRaccontoRealisticoconilWRW);
		System.out.println(rispostaRestituzione1);
		System.out.println("numero libri in presito: " + ArchivioController.libriInPrestito());
		System.out.println(ArchivioController.stampaLibriinPrestito());
	}

}
package day_11;

import java.util.*;

public class GiardinoAsilo {
	// chiave =character value=string con final le costanti vanno scritte tutto in
	// maiscolo
	private static final Map<Character, String> MAPPA_PIANTINE = Map.of('G', "ERBA", 'C', "TRIFOGLIO", 'R', "RAVANELLO",
			'V', "VIOLA");
private static final List<String> LIST_BAMBINI= List.of ("Alice", "Bob", "Charlie", "David", "Eve", "Fred",
		"Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry");
private  Map<String, List<String>> mappaBambiniPiante;

private static final int tazzaPerBambinoPerFila=2;

public GiardinoAsilo (String fila1 , String fila2) {
	if(fila1.length()!= fila2.length()||fila1.length()%2 !=0) {
		throw new IllegalArgumentException(
				"Le righe devono avere la stessa lunghezza e contenere un numero pari di tazze.");
	}

this.mappaBambiniPiante= new HashMap<>();// se array=String[]mappaBambiniSemi= new String[10]

		for (int i = 0; i <LIST_BAMBINI.size();i++ ) {
		//(preincremento)++i, i++(postincremento)
		String bambino=LIST_BAMBINI.get(i);
		int indiceInizio=i*tazzaPerBambinoPerFila;
		int indiceFine=indiceInizio+1;
		List <String>piante=new ArrayList<>();//lista nomi piante associate a ciascun bambino
		piante.add(MAPPA_PIANTINE.get(fila1.charAt(indiceInizio)));
		piante.add(MAPPA_PIANTINE.get(fila1.charAt(indiceFine)));
		piante.add(MAPPA_PIANTINE.get(fila2.charAt(indiceInizio)));
		piante.add(MAPPA_PIANTINE.get(fila2.charAt(indiceFine)));
		this.mappaBambiniPiante.put(bambino, piante);
		}	
	}
public void stampaAssociazionePianteBambino() {
	System.out.println(mappaBambiniPiante);
}
public static void main (String[]args) {
	String fila1 ="VRCGVVRVCGGCCGVRGCVCGCGV";
	String fila2 ="VRCCCGCRRGVCGCRVVCVGCGCV";
	GiardinoAsilo giardino=new GiardinoAsilo(fila1,fila2);
	giardino.stampaAssociazionePianteBambino();
}
}

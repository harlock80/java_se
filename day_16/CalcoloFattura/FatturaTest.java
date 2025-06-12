package day_16.CalcoloFattura;

import java.math.BigDecimal;

public class FatturaTest {
public static void main(String[] args) {

/*	
  //costuttore default
	Cliente paoloRossi = new Cliente();
	paoloRossi.setCf("cf1");
	paoloRossi.setNome("paolo");
	paoloRossi.setCognome("rossi");
	paoloRossi.setPrezzoDaPagare(new BigDecimal ("1200.00"));

	System.out.println(paoloRossi.toString());
	
 	//oggetto con costruttore parametrico
	Cliente gianlucaVacchi = new Cliente( " cf2","gianluca","vacchi","1300.00");
	System.out.println(gianlucaVacchi.toString());
*/	
//	ClienteLuce paolorossi = new ClienteLuce("cf2","paolo","rossi",80.00);
//	System.out.println(paolorossi.toString());
	ClienteFisso marianeri = new ClienteFisso( "cf3","maria","neri",ContrattoFisso.SPECIAL );
	
	System.out.println(marianeri.toString());
	FatturaController.calcoloFattura(marianeri);
	
	ClienteLuce paoloRossi = new ClienteLuce("cf1" , "Paolo" , "Rossi" , 50.00 );
	ClienteLuce lucaBianchi = new ClienteLuce("cf2" , "Luca" , "Bianchi" , 150.00 );
	ClienteLuce gianniRosa = new ClienteLuce("cf3" , "Gianni" , "Rosa" , 250.00 );
	
	FatturaController.calcoloFattura(paoloRossi);
	FatturaController.calcoloFattura(lucaBianchi);
	FatturaController.calcoloFattura(gianniRosa);
	System.out.println(paoloRossi);
	System.out.println(lucaBianchi);
	System.out.println(gianniRosa);

	ClienteGas lucioNero = new ClienteGas ("cf1" , "Lucio" , "Nero" , 30.00 );
	ClienteGas annaRosa = new ClienteGas  ("cf2" , "Anna" , "Rosa" , 60.00 );
	ClienteGas paoloVerde = new ClienteGas("cf3" , "Paolo" , "Verde" , 90.00 );
	
	FatturaController.calcoloFattura(lucioNero);
	FatturaController.calcoloFattura(annaRosa);
	FatturaController.calcoloFattura(paoloVerde);
	
	System.out.println(lucioNero);
	System.out.println(annaRosa);
	System.out.println(paoloVerde);

	ClienteFisso taniaMonia = new ClienteFisso ("cf1" , "Tania" , "Monia" , ContrattoFisso.STANDARD );
	ClienteFisso romoloPino = new ClienteFisso ("cf2" , "Romolo" , "Pino" , ContrattoFisso.SPECIAL );
	ClienteFisso sauroTrex = new ClienteFisso("cf3" , "Sauro" , "Trex" , ContrattoFisso.SUPERSPECIAL );
	
	FatturaController.calcoloFattura(taniaMonia);
	FatturaController.calcoloFattura(romoloPino);
	FatturaController.calcoloFattura(sauroTrex);
	
	System.out.println(taniaMonia);
	System.out.println(romoloPino);
	System.out.println(sauroTrex);
	

	ClienteMobile angeloNovanta = new ClienteMobile ("cf1" , "Angelo" , "Novanta" , 20 );
	ClienteMobile fabioTino= new ClienteMobile ("cf2" , "Fabio" , "Tino" , 50 );
	ClienteMobile elenaMarrone = new ClienteMobile("cf3" , "Elena" , "Marrone" , 90 );
	
	FatturaController.calcoloFattura(angeloNovanta);
	FatturaController.calcoloFattura(fabioTino);
	FatturaController.calcoloFattura(elenaMarrone);
	
	System.out.println(angeloNovanta);
	System.out.println(fabioTino);
	System.out.println(elenaMarrone);
	
}


}






package day_12;

public class Main {
	
public static void main(String[] args) {
		
		Employee dipendente = new Employee();
		Employee superMario = new Employee ("dsdsdas", "daniel" , 1213243);
		Employee wario = new Employee ( "ehjdhfjfd" , "Wario" , 436327 );
		
		System.out.println(dipendente.toString());
		System.out.println(superMario.toString());
		System.out.println(wario.toString());
		superMario.setCodiceFiscale("CF1");
		wario.setCodiceFiscale("CF2");
		dipendente.setCodiceFiscale("CF3");
		System.out.println(dipendente.toString());
		System.out.println(superMario.toString());
		System.out.println(wario.toString());
		dipendente.setNome("Maria");
		dipendente.setStipendio(273621672);
		System.out.println(dipendente);
		

	}

}
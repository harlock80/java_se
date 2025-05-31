package day_7.assicurazione;

import java.time.LocalDate;

public class Archivio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente bruno = new Cliente("BRN", "Bruno", "Rossi", LocalDate.of(1985, 6, 25));
		Cliente rosa = new Cliente("RSO", "Rosa", "Rossi", LocalDate.of(1992, 4, 12));
		Cliente viola = new Cliente("VLI", "Viola", "Ferrari", LocalDate.of(1995, 9, 14));
		System.out.println(bruno);
		System.out.println(rosa);
		System.out.println(viola);
		Veicolo veicolo1 = new Veicolo();
		Veicolo veicolo2 = new Veicolo();
		Veicolo veicolo3 = new Veicolo();
		System.out.println(veicolo1);
		System.out.println(veicolo2);
		System.out.println(veicolo3);
		System.out.println("-------------");
		Veicolo[] archivio = {veicolo1, veicolo2, veicolo3};
		for (int i = 0; i < archivio.length; i++) {
			System.out.println(archivio[i]);
		}

	}

}
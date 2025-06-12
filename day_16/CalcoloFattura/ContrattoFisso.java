package day_16.CalcoloFattura;

public enum ContrattoFisso {
	STANDARD("st" , "standard " ), SPECIAL("sp","special "),SUPERSPECIAL("su" , "superspecial ");

	private String abbr;
	private String valore;

	private ContrattoFisso( String abbr, String valore ) {
		this.abbr = abbr;
		this.valore = valore;
	}

	public String getAbbr() {
		return abbr;
	}

	public String getValore() {
		return valore;
	}

	public static ContrattoFisso fromNome (String contratto   ) {
		for(ContrattoFisso c : values() ) {
			if(c.valore.equalsIgnoreCase(contratto)) {
				return c;
			}
								
		}
		return null;
		
	}

	public static ContrattoFisso fromAbbr (String abbr   ) {
		for(ContrattoFisso c : values() ) {
			if(c.abbr.equalsIgnoreCase(abbr)) {
				return c;
			}
								
		}
		return null;
		
	}
		

	}




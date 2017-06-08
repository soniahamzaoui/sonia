package fr.humanbooster.englishbattlejsf.business;

public class Verbe {
	private String baseVerbale;
	private String preterit;
	private String participePasse;
	private String traduction;
	
	public Verbe(String baseVerbale, String preterit, String participePasse) {
		super();
		this.baseVerbale = baseVerbale;
		this.preterit = preterit;
		this.participePasse = participePasse;
	}
	
	public String getBaseVerbale() {
		return baseVerbale;
	}
	public void setBaseVerbale(String baseVerbale) {
		this.baseVerbale = baseVerbale;
	}
	public String getPreterit() {
		return preterit;
	}
	public void setPreterit(String preterit) {
		this.preterit = preterit;
	}
	public String getParticipePasse() {
		return participePasse;
	}
	public void setParticipePasse(String participePasse) {
		this.participePasse = participePasse;
	}

	public String getTraduction() {
		return traduction;
	}

	public void setTraduction(String traduction) {
		this.traduction = traduction;
	}
	
	@Override
	public boolean equals(Object object) {
		Verbe verbe = (Verbe) object;
		return this.getBaseVerbale().equals(verbe.getBaseVerbale())
			&& this.getPreterit().equals(verbe.getPreterit()) 
			&& this.getParticipePasse().equals(verbe.getParticipePasse());
	}

	@Override
	public String toString() {
		return "Verbe [baseVerbale=" + baseVerbale + ", preterit=" + preterit + ", participePasse=" + participePasse
				+ ", traduction=" + traduction + "]";
	}
	

}

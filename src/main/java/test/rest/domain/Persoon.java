package test.rest.domain;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Persoon {

	@JsonProperty("firstName")
	private String voornaam;

	@JsonProperty("lastName")
	private String achternaam;

	@JsonProperty("dateOfBirth")
//	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonSerialize(using = MyDateSerializer.class)
	private DateTime geboorteDatum;

	public Persoon(String voornaam, String achternaam, DateTime geboorteDatum) {
		setVoornaam(voornaam);
		setAchternaam(achternaam);
		setGeboorteDatum(geboorteDatum);
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public DateTime getGeboorteDatum() {
		return geboorteDatum;
	}

	public void setGeboorteDatum(DateTime geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}

}

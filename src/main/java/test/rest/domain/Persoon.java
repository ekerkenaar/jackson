package test.rest.domain;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Persoon {

    @JsonProperty("firstName")
    private String voornaam;

    @JsonProperty("lastName")
    private String achternaam;

    @JsonProperty("dateOfBirth")
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

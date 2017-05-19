package com.domain;

/**
 * Created by ivana on 19/05/17.
 */
public class Semafor {
    private String culoare;
    private int timpCuloare;
    private String locatie;
    private String uuid;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getTimpCuloare() {
        return timpCuloare;
    }

    public void setTimpCuloare(int timpCuloare) {
        this.timpCuloare = timpCuloare;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}

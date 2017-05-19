package com.domain;

/**
 * Created by ivana on 19/05/17.
 */
public class Camera {
    private String locatie;
    private String uuid;

    public Camera(String locatie, String uuid) {
        this.locatie = locatie;
        this.uuid = uuid;
    }

    public Camera() { }

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

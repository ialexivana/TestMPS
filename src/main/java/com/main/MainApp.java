package com.main;

import com.domain.Camera;
import com.domain.Monitoring;
import com.domain.Semafor;
import com.interfaces.ICamera;
import com.interfaces.ISemafor;

/**
 * Created by ivana on 13/05/17.
 */
public class MainApp {
    Camera camera;
    Semafor semafor;
    Monitoring monitoring;

    ICamera icamera;
    ISemafor isemafor;

    public void init() {
        camera = new Camera();
        semafor = new Semafor();
    }

    public static void main(String[] args) {
        System.out.print("Hi");
    }

    public String writeHello(String name) {
        return "Hi " + name;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Semafor getSemafor() {
        return semafor;
    }

    public void setSemafor(Semafor semafor) {
        this.semafor = semafor;
    }

    public Monitoring getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    public ICamera getIcamera() {
        return icamera;
    }

    public void setIcamera(ICamera icamera) {
        this.icamera = icamera;
    }

    public ISemafor getIsemafor() {
        return isemafor;
    }

    public void setIsemafor(ISemafor isemafor) {
        this.isemafor = isemafor;
    }
}

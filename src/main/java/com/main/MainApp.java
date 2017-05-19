package com.main;

import com.domain.Camera;
import com.domain.Semafor;
import com.interfaces.ICamera;
import com.interfaces.ISemafor;

/**
 * Created by ivana on 13/05/17.
 */
public class MainApp {
    Camera camera;
    Semafor semafor;

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
}

package com.business;

import com.domain.Camera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by ivana on 19/05/17.
 */
public class CameraTest {
    @Test
    public void testMainClass() {
        Camera camera = new Camera("Gorjului", "camera1");
        assertEquals(camera.getLocatie(), "Gorjului");
    }
}

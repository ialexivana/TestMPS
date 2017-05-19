package com.main;

import com.domain.Camera;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by ivana on 17/05/17.
 */
public class TestClass {
    MainApp mainApp = new MainApp();
    @Test
    public void testMainClass() {
        mainApp.init();
        assertEquals(mainApp.writeHello("MPS"), "Hi MPS");
        assertNotNull(mainApp.getCamera());
        mainApp.writeHello("MPS");
    }
}

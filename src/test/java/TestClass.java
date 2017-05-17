import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by ivana on 17/05/17.
 */
public class TestClass {
    MainApp mainApp = new MainApp();
    @Test
    public void testCalculateAppriasal() {
        assertEquals(mainApp.writeHello("MPS"), "Hi MPS");
        mainApp.writeHello("MPS");
    }
}

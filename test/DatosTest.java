import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DatosTest {
    @Test
    @DisplayName("Comprobar objeto")
    public void comprobarMismaInstancia(){
        Datos dato1 = Datos.getInstance();
        Datos dato2 = Datos.getInstance();
        Assertions.assertSame(dato1,dato2);
    }



}


package co.edu.utp.misiontic2022.c2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @Disabled
    //@DisplayName("10 km/h es igual a 2.78 m/s")
    public void testVelocidad(){
        App App_test = new App();
        assertEquals(2.78, App_test.velocidad("10"), 0.01, "10 km/h es igual a 2.77 m/s");
    }
    @ParameterizedTest(name = "{0} en km/h = {1} en m/s")
    @CsvSource({
        "1, 0.27",
        "10, 2.78",
        "20, 5.56"
    })
    public void testVelocidadVarios(String vel_kmh, double expectedResult){
        App App_test = new App();
        assertEquals(expectedResult, App_test.velocidad(vel_kmh), 0.01, () -> vel_kmh + " km/h es igual a " + expectedResult + " m/s");
    }
}

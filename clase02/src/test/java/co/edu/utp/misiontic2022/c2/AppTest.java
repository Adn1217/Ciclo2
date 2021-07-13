package co.edu.utp.misiontic2022.c2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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
    static App App_test;
    /**
     * Rigorous Test :-)
     */
    @BeforeAll
    static void beforeAll(){
        App_test = new App();
        System.out.println("Se crea la instancia para pruebas de la clase...\n");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Inicia prueba...\n");
    }

    @Test
    @Disabled
    //@DisplayName("10 km/h es igual a 2.78 m/s")
    public void testVelocidad(){
        //App App_test = new App(); // No necesario al instanciar en beforeAll.
        assertEquals(2.78, App.velocidad("10"), 0.01, "10 km/h es igual a 2.77 m/s");
    }

    @ParameterizedTest(name = "{0} en km/h = {1} en m/s")
    @CsvSource({
        "1, 0.27",
        "10, 2.78",
        "20, 5.56"
    })
    public void testVelocidadVarios(String vel_kmh, double expectedResult){
        //App App_test = new App(); no necesario al instanciar en beforeAll.
        assertEquals(expectedResult, App_test.velocidad(vel_kmh), 0.01, () -> vel_kmh + " km/h es igual a " + expectedResult + " m/s");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Finaliza prueba...\n");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Prueba finalizada completamente.");
    }
}

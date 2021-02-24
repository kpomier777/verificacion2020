package Tests;

import filaB.p1.Ej1UtilsNumeros;
import org.junit.*;

public class p1 {
    @BeforeClass
    public static void beforeClass(){
        System.out.println(" *****Iniciando Testeo");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println(" ******Finalisando Testeo");
    }

    Ej1UtilsNumeros primo;
    @Before
    public void before(){
        primo = new Ej1UtilsNumeros();
    }
    @After
    public void after(){
        System.out.println(" Finalizando uno de tres test");
    }

    @Test
    public void primotest1(){
        boolean actualResult= primo.esPrimo(5);
        boolean expectedResult= true;
        Assert.assertEquals("ERROR! hay un error en el metodo esprimo",expectedResult,actualResult);
    }

    @Test
    public void primotest2(){
        boolean actualResult= primo.esPrimo(4);
        boolean expectedResult= false;
        Assert.assertEquals("ERROR! hay un error en el metodo esprimo",expectedResult,actualResult);
    }

    @Test
    public void primotest3(){
        boolean actualResult= primo.esPrimo(2);
        boolean expectedResult= true;
        Assert.assertEquals("ERROR! hay un error en el metodo esprimo",expectedResult,actualResult);
    }

}

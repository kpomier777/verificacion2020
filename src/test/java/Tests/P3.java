package Tests;

import filaB.p3.Ej3Utils;
import org.junit.Assert;
import org.junit.Test;

public class P3 {


    @Test(timeout = 2000)
    public void verify1() throws Exception {
        Ej3Utils ciclas = new Ej3Utils();
        boolean actResult = ciclas.isCorrectCI("4534534");
        boolean expResult = true;;
        Assert.assertEquals("Error de tiempo",expResult, actResult);
    }

    @Test(expected = NullPointerException.class)
    public void testUtil12() throws Exception {
        Ej3Utils ciclas = new Ej3Utils();
        boolean actResult = ciclas.isCorrectCI(null);
        boolean expResult = true;
        Assert.assertEquals("Error exception",expResult, actResult);
    }


    @Test (expected = Exception.class)
    public void verify2() throws Exception {
        Ej3Utils ciclas = new Ej3Utils();
        boolean actResult = ciclas.isCorrectCI("0");
        String expResult = "ci no puede ser 0";
        Assert.assertEquals("Error excetion",expResult, actResult);
    }

}

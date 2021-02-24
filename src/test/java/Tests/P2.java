package Tests;

import filaB.p2.Ej2Notas;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class P2 {
    private int firstNumber;
    private String expectedResult;

    public P2(int firstNumber, String expectedResult){
        this.firstNumber=firstNumber;
        this.expectedResult=expectedResult;
    }
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects= new ArrayList<>();
        objects.add(new Object[]{0, "VALOR INCORRECTO"});
        objects.add(new Object[]{1, "F"});
        objects.add(new Object[]{2, "F"});
        objects.add(new Object[]{5, "F"});
        objects.add(new Object[]{9, "B"});
        objects.add(new Object[]{10, "A"});
        objects.add(new Object[]{11, "VALOR INCORRECTO"});
        return objects;
    }
    @Test
    public void testnota(){
        Ej2Notas notas= new Ej2Notas();
        String actualResult=  notas.notasCualitativas(this.firstNumber);
        Assert.assertEquals("ERROR ! falta la resolucion a aeste caso",this.expectedResult,actualResult);
    }
}

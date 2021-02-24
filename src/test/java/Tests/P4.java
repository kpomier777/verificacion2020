package Tests;

import filaB.p4.Login;
import filaB.p4.Util;
import filaB.p4.Util2;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class P4 {
    Util2 serviceMockito= Mockito.mock(Util2.class);
    Util serviceMockito2= Mockito.mock(Util.class);

    @Test
    public void verify_factorial_test(){

        // PASO 3 para MOCK - poner datos de entrada y salida al metodo externo
        Mockito.when(serviceMockito.isUserValid("ke","CRUD")).thenReturn(true);

        Mockito.when(serviceMockito2.getPermision("ke","CRUD")).thenReturn("CRUD");

        //PASO 4 para MOCK - utilizar el constrcutor parametrizado y enviar el objeto mockeado
        Login l = new Login(serviceMockito);
        String actualResult=l.roleUser("ke");
        int expectedResult=24;
        Assert.assertEquals("ERROR en factorial!",expectedResult,actualResult);

        // Verificacion que realmente estamos utilizando el mock del metodo
        Mockito.verify(serviceMockito).multi(1,1);
        Mockito.verify(serviceMockito).multi(1,2);
        Mockito.verify(serviceMockito).multi(2,3);
        Mockito.verify(serviceMockito).multi(6,4);
    }
}

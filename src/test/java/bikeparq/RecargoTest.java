package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RecargoTest {

    @Test
    void entradaALasVeintidosSumaDosMilPesos() {
          int tarifa = 3000;
           int horaEntrada = 22;
         int total = Recargo.aplicarRecargoNocturno(tarifa, horaEntrada);
          assertEquals(5000, total);
    }
    @Test
    void entradaALasDiezMantieneLaTarifa() {

         assertEquals(3000, Recargo.aplicarRecargoNocturno(3000, 10));
    }

    @Test

    void aLasDiecinueveTodaviaSeCobraLaTarifaNormal() {

           assertEquals(3000, Recargo.aplicarRecargoNocturno(3000, 19));
    }

    @Test
    void aLasVeinteEmpiezaElRecargoNocturno() {


        assertEquals(5000, Recargo.aplicarRecargoNocturno(3000, 20));
    }
    @Test
    
    void noSeCobraRecargoDuranteElTiempoDeGracia() {


        assertEquals(0, Recargo.aplicarRecargoNocturno(0, 23));
    }
}
package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TarifaTest {

    @Test
    void carroDuranteSesentaMinutosPagaTresMilPesos() {
        int minutos = 60;
        String tipo = "carro";

        int tarifa = Tarifa.calcularTarifa(minutos, tipo);

        assertEquals(3000, tarifa);
    }

    @Test
    void motoDuranteDiezMinutosEstaEnTiempoDeGracia() {
        int minutos = 10;
        String tipo = "moto";

        int tarifa = Tarifa.calcularTarifa(minutos, tipo);

        assertEquals(0, tarifa);
    }

    @Test
    void bicicletaLanzaExcepcionPorTipoInvalido() {
        int minutos = 60;
        String tipo = "bicicleta";

        assertThrows(IllegalArgumentException.class,
                () -> Tarifa.calcularTarifa(minutos, tipo));
    }
}
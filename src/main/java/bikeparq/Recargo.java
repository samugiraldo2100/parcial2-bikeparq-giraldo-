package bikeparq;

public final class Recargo {

    private static final int  MONTO_RECARGO_NOCTURNO = 2000;

    private static final int  HORA_INICIO_NOCTURNO = 20;
    private static final int ULTIMA_HORA_NOCTURNA = 5;

    private Recargo() {
    }

    public static int aplicarRecargoNocturno(int tarifa, int horaEntrada) {

         if (horaEntrada >= HORA_INICIO_NOCTURNO || horaEntrada <= ULTIMA_HORA_NOCTURNA) {

             return tarifa + MONTO_RECARGO_NOCTURNO;
        }

        return tarifa;
    }
}
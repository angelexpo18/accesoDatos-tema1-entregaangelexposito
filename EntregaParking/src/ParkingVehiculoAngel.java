

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkingVehiculoAngel implements ParkingAngel {

    private static final double PRECIO_MINUTO = 0.0425;
    private static final int MAX_PLAZAS = 100;

    private int plazasActualesOcupadas;

    public ParkingVehiculoAngel(String direccion) {
        this.plazasActualesOcupadas = 0;
    }

    @Override
    public boolean hayPlaza() {
        return plazasActualesOcupadas < MAX_PLAZAS;
    }

    @Override
    public void aparcaCoche(VehiculoAngel vehiculo) {
        if (hayPlaza()) {
            plazasActualesOcupadas++;
            vehiculo.setFechaInicio(LocalDateTime.now());
        } else {
            System.out.println("No hay plazas disponibles");
        }
    }

    @Override
    public void sacaCoche(VehiculoAngel vehiculo) {
        if (plazasActualesOcupadas > 0) {
            plazasActualesOcupadas--;
            vehiculo.setFechaFin(LocalDateTime.now());
        } else {
            System.out.println("No hay coches aparcados en el parking");
        }

    }

    @Override
    public double getFactura(VehiculoAngel vehiculo) {
        long minutosAparcado = ChronoUnit.MINUTES.between(vehiculo.getFechaInicio(), vehiculo.getFechaFin());
        return minutosAparcado * PRECIO_MINUTO;
    }
}

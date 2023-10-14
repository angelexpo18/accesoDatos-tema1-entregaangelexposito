

public interface ParkingAngel {
    boolean hayPlaza();
    void aparcaCoche(VehiculoAngel vehiculo);
    void sacaCoche(VehiculoAngel vehiculo);
    double getFactura(VehiculoAngel vehiculo);
}
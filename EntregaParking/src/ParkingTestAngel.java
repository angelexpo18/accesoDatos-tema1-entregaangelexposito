

public class ParkingTestAngel {

    public static void main(String[] args) {

        ParkingVehiculoAngel parking = new ParkingVehiculoAngel("Calle Bernabeu 123");

        VehiculoAngel vehiculo1 = new VehiculoAngel("2543ABC");
        VehiculoAngel vehiculo2 = new VehiculoAngel("4252DEF");
        VehiculoAngel vehiculo3 = new VehiculoAngel("9647GHI");
        VehiculoAngel vehiculo4 = new VehiculoAngel("0885JKL");
        VehiculoAngel vehiculo5 = new VehiculoAngel("9543MNO");

        parking.aparcaCoche(vehiculo1);
        parking.aparcaCoche(vehiculo2);
        parking.aparcaCoche(vehiculo3);
        parking.aparcaCoche(vehiculo4);
        parking.aparcaCoche(vehiculo5);

        System.out.println("Los 5 coches han sido aparcados en el parking");

        parking.sacaCoche(vehiculo1);
        parking.sacaCoche(vehiculo2);
        parking.sacaCoche(vehiculo3);
        parking.sacaCoche(vehiculo4);
        parking.sacaCoche(vehiculo5);

        System.out.println("Los 5 coches han sido sacados del parking");

        
        double factura1 = parking.getFactura(vehiculo1);
        double factura2 = parking.getFactura(vehiculo2);
        double factura3 = parking.getFactura(vehiculo3);
        double factura4 = parking.getFactura(vehiculo4);
        double factura5 = parking.getFactura(vehiculo5);

        System.out.println("La factura de " +vehiculo1+ " es de " + factura1 + " euros");
        System.out.println("La factura de " +vehiculo2+ " es de " + factura2 + " euros");
        System.out.println("La factura de " +vehiculo3+ " es de " + factura3 + " euros");
        System.out.println("La factura de " +vehiculo4+ " es de " + factura4 + " euros");
        System.out.println("La factura de " +vehiculo5+ " es de " + factura5 + " euros");

    }
}
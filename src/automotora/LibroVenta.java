package automotora;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta() {
    }

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo, String nombreVenta, String fechaVenta ){
        String fileName = "ficheros/" + nombreVenta + ".txt";
        File archivo = new File(fileName);
        try {
            if (archivo.createNewFile()) {
                System.out.println("---------------------------------------------------");
                System.out.println("Archivo creado");
                FileWriter fw = new FileWriter(fileName, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Patente del vehiculo: " + vehiculo.getPatente() + "\n");
                bw.write("Edad del cliente: " + cliente.getEdad() + "\n");
                bw.write("Fecha de la venta: " + fechaVenta + "\n");
                bw.write("Nombre de la venta: " + nombreVenta + "\n");
                bw.close();
                System.out.println("Datos guardados: " + "\nPatente " + vehiculo.getPatente() + "\nCliente: " + cliente.getEdad() + "\nFecha de Venta: " +  fechaVenta +  "\nNombre de la venta: " + nombreVenta);
                System.out.println("Archivo guardado en: " + fileName);
                System.out.println("---------------------------------------------------");
            } else {
                System.out.println("El archivo ya existe, por favor cambie el nombre de la venta");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

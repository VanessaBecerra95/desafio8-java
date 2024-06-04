package automotora;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Rojo", "ABC123", 100);
        Bus bus = new Bus("Azul", "DEF456", 50);
        MiniBus miniBus = new MiniBus("Verde", "GHI789", 30, "automotora.MiniBus Company");
        Cliente cliente1 = new Cliente("Juan Díaz", "123456789", 30);
        Cliente cliente2 = new Cliente("Bárbara León", "234567891", 52);
        Cliente cliente3 = new Cliente("René Bridge", "345678912", 26);
        Vendedor vendedor = new Vendedor("Pedro", "987654321", 40, "Calle Falsa 123");

        //prueba con los siguientes datos:
        LibroVenta libroVenta = new LibroVenta();
        //primer cliente
        libroVenta.guardarVenta(cliente1, taxi, "Venta de taxi", "06032023");
        //segundo cliente
        libroVenta.guardarVenta(cliente2, bus, "Venta de bus", "31108022");
        //tercer cliente
        libroVenta.guardarVenta(cliente3, miniBus, "Venta de miniBus", "01102020");

    }
    

}
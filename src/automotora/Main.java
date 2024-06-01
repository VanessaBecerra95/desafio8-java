package automotora;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Rojo", "ABC123", 100);
        Bus bus = new Bus("Azul", "DEF456", 50);
        MiniBus miniBus = new MiniBus("Verde", "GHI789", 30, "automotora.MiniBus Company");
        Cliente cliente = new Cliente("Juan", "123456789", 30);
        Vendedor vendedor = new Vendedor("Pedro", "987654321", 40, "Calle Falsa 123");


        System.out.println(taxi.toString());
        System.out.println(bus.toString());
        miniBus.imprimeBus();
        System.out.println(cliente.toString());
        System.out.println(vendedor.toString());

    }
}
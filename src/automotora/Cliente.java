package automotora;

public class Cliente extends Persona {
    public Cliente() {
    }

    public Cliente(String nombre, String rut, int edad) {
        super(nombre, rut, edad);
    }

    @Override
    public String toString() {
        return "automotora.Cliente{" +
                "rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                '}';
    }

}
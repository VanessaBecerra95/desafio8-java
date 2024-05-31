public class Vendedor extends Persona{
    private String direccion;

    public Vendedor() {
    }

    public Vendedor(String nombre, String rut, int edad, String direccion) {
        super(nombre, rut, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

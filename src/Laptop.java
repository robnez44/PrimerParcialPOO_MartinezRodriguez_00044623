public class Laptop extends Producto{
    private int RAM;

    //Constructores
    public Laptop(String nombre, String modelo, String descripcion, float precio, char tipoProducto, int RAM) {
        super(nombre, modelo, descripcion, precio, tipoProducto);
        this.RAM = RAM;
    }

    public Laptop() {}

    public Laptop(String nombre, String modelo, String descripcion, float precio, char tipoProducto) {
        super(nombre, modelo, descripcion, precio, tipoProducto);
    }

    //Getter and Setter
    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    //Metodos
    public float obtenerPrecio(Producto p) {
        return p.getPrecio();
    }

    public String obtenerDescripcion(Producto p) {
        return p.getDescripcion();
    }
}

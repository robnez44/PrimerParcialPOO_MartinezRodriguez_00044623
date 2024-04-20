public class Telefono extends Producto{
    private int almacenamiento;

    //  Constructores
    public Telefono(String nombre, String modelo, String descripcion, float precio, char tipoProducto, int almacenamiento) {
        super(nombre, modelo, descripcion, precio, tipoProducto);
        this.almacenamiento = almacenamiento;
    }

    public Telefono() {}

    public Telefono(String nombre, String modelo, String descripcion, float precio, char tipoProducto) {
        super(nombre, modelo, descripcion, precio, tipoProducto);

    }

    //Getter and Setter
    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    //Metodos
    public float obtenerPrecio(Producto p) {
        return p.getPrecio();
    }
    public String obtenerDescripcion(Producto p) {
        return p.getDescripcion();
    }
}
